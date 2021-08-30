package pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Providers",
        "Integrations",
        "Organization"
})
class Permissions {

    @JsonProperty("Providers")
    private String providers;
    @JsonProperty("Integrations")
    private String integrations;
    @JsonProperty("Organization")
    private String organization;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Providers")
    public String getProviders() {
        return providers;
    }

    @JsonProperty("Providers")
    public void setProviders(String providers) {
        this.providers = providers;
    }

    @JsonProperty("Integrations")
    public String getIntegrations() {
        return integrations;
    }

    @JsonProperty("Integrations")
    public void setIntegrations(String integrations) {
        this.integrations = integrations;
    }

    @JsonProperty("Organization")
    public String getOrganization() {
        return organization;
    }

    @JsonProperty("Organization")
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "tokenId",
        "token",
        "email",
        "role"
})
public class RespAuthenticationpojo {

    @JsonProperty("tokenId")
    private String tokenId;
    @JsonProperty("token")
    private String token;
    @JsonProperty("email")
    private String email;
    @JsonProperty("role")
    private Role role;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tokenId")
    public String getTokenId() {
        return tokenId;
    }

    @JsonProperty("tokenId")
    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("role")
    public Role getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(Role role) {
        this.role = role;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "permissions"
})
class Role {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("permissions")
    private Permissions permissions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("permissions")
    public Permissions getPermissions() {
        return permissions;
    }

    @JsonProperty("permissions")
    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}