/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastpapers;

/**
 *
 * @author tvnmt
 */
public interface IEstateAgent {

    double EstateAgentSales(double[] propertySales);

    double EstateAgentCommission(double propertySales);

    int TopEstateAgent(double[] totalSales);
}
