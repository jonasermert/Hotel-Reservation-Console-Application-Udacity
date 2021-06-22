package com.jonasermert;

public class Tester {

    public static void main(String[] args) {
        Customer customer = new Customer("first", "second","email@yahoo.com", new SplittableRandom().nextInt(1000000, 9999999));
        CustomerService.addCustomer("first", "s", "email@gmail.com");
        ReservationService.addRoom((IRoom) new Room("100", RoomType.DOUBLE, 20.0));
        ReservationService.addRoom((IRoom) new FreeRoom("101", RoomType.SINGLE));
        ReservationService.addRoom((IRoom) new Room("102", RoomType.SINGLE, 1));
        ReservationService.reserveARoom(customer, ReservationService.getARoom("105"),
                MainMenu.checkDate("2021-09-03"), MainMenu.checkDate("2021-09-14"));
        System.out.println(ReservationService.printAllReservations().get(0).getCheckIn());
        ReservationService.reserveARoom(customer, ReservationService.getARoom("101"),
                MainMenu.checkDate("2021-09-05"), MainMenu.checkDate("2021-10-24"));
        ReservationService.reserveARoom(customer, ReservationService.getARoom("103"),
                MainMenu.checkDate("2021-09-24"), MainMenu.checkDate("2021-6-05"));
        System.out.println(HotelResource.findRooms(MainMenu.checkDate("2021-01-16"), MainMenu.checkDate("2021-12-30")));
        System.out.println(ReservationService.printAllReservations().get(0).getCheckIn());
        System.out.println(HotelResource.getCustomerReservation(customer));
        System.out.println(HotelResource.lastChanceRoom());


}
