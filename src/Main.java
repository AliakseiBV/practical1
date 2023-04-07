import task.BusinessTrip;
public class Main {

    public static void main(String[] args) {

        BusinessTrip[] BusinessTrips = new BusinessTrip[]{
                new BusinessTrip("Sergey Rachmaninoff", 2200, 15),
                new BusinessTrip(null, 0, 0),
                new BusinessTrip("Alfred Schnitke", 110, 1),
                new BusinessTrip("John Cage", 433, 2),
                new BusinessTrip()
        };


        //code to show all the trips and....
        for (BusinessTrip trip : BusinessTrips) {
            System.out.println(trip.showAll() + '\n');
        }
        //and to show the trip with maximum cost
        //Method findingMaximumCost is used here (written below)
        System.out.println("The trip with the maximum cost is: " + findingMaximumCost(BusinessTrips));

        //Code to update the transportation expenses of the last object of array. I update its value by 1 (getTransportationExpenses() + 1)
        //Since we should write the code INDEPENDENT to the array volume,
        //I pointed the last element as 'BusinessTrips.length - 1'
        BusinessTrips[BusinessTrips.length - 1].
                setTransportationExpenses(BusinessTrips[BusinessTrips.length - 1].
                        getTransportationExpenses() + 1);
        System.out.println(BusinessTrips[BusinessTrips.length - 1]);

        //Output the total duration of two initial business trips by the single operator
        //If I understood the idea correctly.....
        System.out.println("Duration: " + (BusinessTrips[0].getNumberOfDays()
                + BusinessTrips[1].getNumberOfDays()));

        //Output the array content to the console (one element per line), using toString( ) method implicitly
        for (BusinessTrip businessTrip : BusinessTrips) {
            System.out.println(businessTrip);
        }


    }

    //separate method to find a trip with maximum cost - is used above
    public static BusinessTrip findingMaximumCost(BusinessTrip[] BusinessTrips) {
        BusinessTrip tripWithMaximumCost = new BusinessTrip("null", 0, 0);
        for (BusinessTrip businessTrip : BusinessTrips) {
            for (BusinessTrip businessTripInternal : BusinessTrips) {
                if((businessTrip.getTotalInCents() > businessTripInternal.getTotalInCents())
                        && (businessTrip.getTotalInCents() > tripWithMaximumCost.getTotalInCents())){
                    tripWithMaximumCost = businessTrip;
                }
            }
        }
        return tripWithMaximumCost;
    }
}
