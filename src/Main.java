import task.BusinessTrip;

//Corrected code after comments

public class Main {

    public static void main(String[] args) {

        BusinessTrip[] businessTrips = new BusinessTrip[]{
                new BusinessTrip("Sergey Rachmaninoff", 2200, 15),
                null,
                new BusinessTrip("Alfred Schnitke", 1111110, 1),
                new BusinessTrip("John Cage", 433, 2),
                new BusinessTrip()
        };

        //code to show all the trips and....
        for (BusinessTrip trip : businessTrips) {
            System.out.println(trip.showAll() + '\n');
        }

        //and to show the trip with maximum cost
        //Method findingMaximumCost is used here (written below)
        System.out.println("The trip with the maximum cost is: " + findingMaximumCost(businessTrips));

        //Code to update the transportation expenses of the last object of array. I update its value by 1 (getTransportationExpenses() + 1)
        //Since we should write the code INDEPENDENT to the array volume,
        //I pointed the last element as 'businessTrips.length - 1'
        businessTrips[businessTrips.length - 1].
                setTransportationExpenses(businessTrips[businessTrips.length - 1].
                        getTransportationExpenses() + 1);
        System.out.println(businessTrips[businessTrips.length - 1]);

        //Output the total duration of two initial business trips by the single operator
        //If I understood the idea correctly.....
        System.out.println("Duration: " + (businessTrips[0].getNumberOfDays()
                + businessTrips[1].getNumberOfDays()));

        //Output the array content to the console (one element per line), using toString( ) method implicitly
        for (BusinessTrip businessTrip : businessTrips) {
            System.out.println(businessTrip);
        }

    }

    //separate method to find a trip with maximum cost - is used above
    public static BusinessTrip findingMaximumCost(BusinessTrip[] BusinessTrips) {
        BusinessTrip tripWithMaximumCost = new BusinessTrip("null", 0, 0);
        for (BusinessTrip businessTrip : BusinessTrips) {
            if (businessTrip == null){
                continue;
            }
            tripWithMaximumCost = (businessTrip.getTotal() > tripWithMaximumCost.getTotal() ?
            businessTrip : tripWithMaximumCost);
            }
        return tripWithMaximumCost;
    }
}
