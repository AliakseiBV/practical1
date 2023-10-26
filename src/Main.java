import task.BusinessTrip;

//Corrected code after comments

public class Main {

    public static void main(String[] args) {

        BusinessTrip[] businessTrips = new BusinessTrip[]{
                new BusinessTrip("Sergey Rachmaninoff", 2200, 15),
                new BusinessTrip("Alfred Schnitke", 1111110, 1),
                null,
                new BusinessTrip("John Cage", 433, 2),
                new BusinessTrip()
        };

        //code to show all the trips and....
        for (BusinessTrip trip : businessTrips) {
            if(trip != null) {
                trip.show();
            }
        }

        //and to show the trip with maximum cost
        //Method findingMaximumCost is used here (written below)
        System.out.println("The trip with the maximum cost is: " + findingMaximumCost(businessTrips) + "\n");

        //Code to update the transportation expenses of the last object of array.
        businessTrips[businessTrips.length - 1].setTransportationExpenses(1);
        System.out.println("Updated transportation expenses - " + businessTrips[businessTrips.length - 1] + "\n");

        //Output the total duration of two initial business trips by the single operator
        //If I understood the idea correctly.....
        System.out.println("Duration of two initial trips: " + (businessTrips[0].getNumberOfDays()
                + businessTrips[1].getNumberOfDays()) + "\n");

        //Output the array content to the console (one element per line), using toString( ) method implicitly
        for (BusinessTrip businessTrip : businessTrips) {
                System.out.println(businessTrip);
        }
    }

    //separate method to find a trip with maximum cost - is used above
    public static BusinessTrip findingMaximumCost(BusinessTrip[] BusinessTrips) {
        BusinessTrip tripWithMaximumCost = new BusinessTrip("null", 0, 0);
        for (BusinessTrip businessTrip : BusinessTrips) {
            if (businessTrip != null) {
                tripWithMaximumCost = (businessTrip.getTotal() > tripWithMaximumCost.getTotal() ?
                        businessTrip : tripWithMaximumCost);
            }
        }
        return tripWithMaximumCost;
    }
}
