/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.TreasurerOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.Admin.AdminWorkAreaJPanel;
import UserInterface.Hospital.Treasurer.TreasurerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class TreasurerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new TreasurerWorkAreaJPanel(userProcessContainer, account, (TreasurerOrganization)organization, enterprise, system);
    }

}
