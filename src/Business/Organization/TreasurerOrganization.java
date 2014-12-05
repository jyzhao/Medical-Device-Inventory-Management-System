/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.TreasurerRole;
import java.util.ArrayList;

public class TreasurerOrganization extends Organization{

    public TreasurerOrganization() {
        super(Type.Treasurer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new TreasurerRole());
        return roles;
    }
     
}
