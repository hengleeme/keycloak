package org.keycloak.models.utils;

import org.keycloak.models.ClientModel;
import org.keycloak.models.OfflineClientSessionModel;
import org.keycloak.models.OfflineUserSessionModel;
import org.keycloak.models.UserConsentModel;
import org.keycloak.models.RoleModel;
import org.keycloak.models.UserCredentialModel;
import org.keycloak.models.UserCredentialValueModel;
import org.keycloak.models.UserModel;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public class UserModelDelegate implements UserModel {
    protected UserModel delegate;

    public UserModelDelegate(UserModel delegate) {
        this.delegate = delegate;
    }

    @Override
    public String getId() {
        return delegate.getId();
    }

    @Override
    public String getUsername() {
        return delegate.getUsername();
    }

    @Override
    public void setUsername(String username) {
        delegate.setUsername(username);
    }

    @Override
    public boolean isEnabled() {
        return delegate.isEnabled();
    }

    @Override
    public boolean isOtpEnabled() {
        return delegate.isOtpEnabled();
    }

    @Override
    public void setEnabled(boolean enabled) {
        delegate.setEnabled(enabled);
    }

    @Override
    public void setSingleAttribute(String name, String value) {
        delegate.setSingleAttribute(name, value);
    }

    @Override
    public void setAttribute(String name, List<String> values) {
        delegate.setAttribute(name, values);
    }

    @Override
    public void removeAttribute(String name) {
        delegate.removeAttribute(name);
    }

    @Override
    public String getFirstAttribute(String name) {
        return delegate.getFirstAttribute(name);
    }

    @Override
    public List<String> getAttribute(String name) {
        return delegate.getAttribute(name);
    }

    @Override
    public Map<String, List<String>> getAttributes() {
        return delegate.getAttributes();
    }

    @Override
    public Set<String> getRequiredActions() {
        return delegate.getRequiredActions();
    }

    @Override
    public void addRequiredAction(String action) {
        delegate.addRequiredAction(action);
    }

    @Override
    public void removeRequiredAction(String action) {
        delegate.removeRequiredAction(action);
    }

    @Override
    public void addRequiredAction(RequiredAction action) {
        delegate.addRequiredAction(action);
    }

    @Override
    public void removeRequiredAction(RequiredAction action) {
        delegate.removeRequiredAction(action);
    }

    @Override
    public String getFirstName() {
        return delegate.getFirstName();
    }

    @Override
    public void setFirstName(String firstName) {
        delegate.setFirstName(firstName);
    }

    @Override
    public String getLastName() {
        return delegate.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        delegate.setLastName(lastName);
    }

    @Override
    public String getEmail() {
        return delegate.getEmail();
    }

    @Override
    public void setEmail(String email) {
        delegate.setEmail(email);
    }

    @Override
    public boolean isEmailVerified() {
        return delegate.isEmailVerified();
    }

    @Override
    public void setEmailVerified(boolean verified) {
        delegate.setEmailVerified(verified);
    }

    @Override
    public void setOtpEnabled(boolean totp) {
        delegate.setOtpEnabled(totp);
    }

    @Override
    public void updateCredential(UserCredentialModel cred) {
        delegate.updateCredential(cred);
    }

    @Override
    public List<UserCredentialValueModel> getCredentialsDirectly() {
        return delegate.getCredentialsDirectly();
    }

    @Override
    public void updateCredentialDirectly(UserCredentialValueModel cred) {
        delegate.updateCredentialDirectly(cred);
    }

    @Override
    public Set<RoleModel> getRealmRoleMappings() {
        return delegate.getRealmRoleMappings();
    }

    @Override
    public Set<RoleModel> getClientRoleMappings(ClientModel app) {
        return delegate.getClientRoleMappings(app);
    }

    @Override
    public boolean hasRole(RoleModel role) {
        return delegate.hasRole(role);
    }

    @Override
    public void grantRole(RoleModel role) {
        delegate.grantRole(role);
    }

    @Override
    public Set<RoleModel> getRoleMappings() {
        return delegate.getRoleMappings();
    }

    @Override
    public void deleteRoleMapping(RoleModel role) {
        delegate.deleteRoleMapping(role);
    }

    @Override
    public String getFederationLink() {
        return delegate.getFederationLink();
    }

    @Override
    public void setFederationLink(String link) {
        delegate.setFederationLink(link);
    }

    @Override
    public String getServiceAccountClientLink() {
        return delegate.getServiceAccountClientLink();
    }

    @Override
    public void setServiceAccountClientLink(String clientInternalId) {
        delegate.setServiceAccountClientLink(clientInternalId);
    }

    @Override
    public void addConsent(UserConsentModel consent) {
        delegate.addConsent(consent);
    }

    @Override
    public UserConsentModel getConsentByClient(String clientId) {
        return delegate.getConsentByClient(clientId);
    }

    @Override
    public List<UserConsentModel> getConsents() {
        return delegate.getConsents();
    }

    @Override
    public void updateConsent(UserConsentModel consent) {
        delegate.updateConsent(consent);
    }

    @Override
    public boolean revokeConsentForClient(String clientId) {
        return delegate.revokeConsentForClient(clientId);
    }

    public UserModel getDelegate() {
        return delegate;
    }
    
    @Override
    public Long getCreatedTimestamp(){
        return delegate.getCreatedTimestamp();
    }
    
    @Override
    public void setCreatedTimestamp(Long timestamp){
        delegate.setCreatedTimestamp(timestamp);
    }

    @Override
    public void addOfflineUserSession(OfflineUserSessionModel userSession) {
        delegate.addOfflineUserSession(userSession);
    }

    @Override
    public OfflineUserSessionModel getOfflineUserSession(String userSessionId) {
        return delegate.getOfflineUserSession(userSessionId);
    }

    @Override
    public Collection<OfflineUserSessionModel> getOfflineUserSessions() {
        return delegate.getOfflineUserSessions();
    }

    @Override
    public boolean removeOfflineUserSession(String userSessionId) {
        return delegate.removeOfflineUserSession(userSessionId);
    }

    @Override
    public void addOfflineClientSession(OfflineClientSessionModel clientSession) {
        delegate.addOfflineClientSession(clientSession);
    }

    @Override
    public OfflineClientSessionModel getOfflineClientSession(String clientSessionId) {
        return delegate.getOfflineClientSession(clientSessionId);
    }

    @Override
    public Collection<OfflineClientSessionModel> getOfflineClientSessions() {
        return delegate.getOfflineClientSessions();
    }

    @Override
    public boolean removeOfflineClientSession(String clientSessionId) {
        return delegate.removeOfflineClientSession(clientSessionId);
    }
}
