public class Main {
    public static void main(String[] args) {

        Service ultrasound = new Ultrasound("Nightingale");
        Service ecg = new ECG("Seacole");
        Service dialysis = new Dialysis("Henderson");
        Service massage = new Massage("Seacole");


        System.out.println(ecg.getName() + " is in " + ecg.getLocation());

        ecg.setLocation("Nightingale");

        dialysis.start();
        System.out.println(dialysis.getName() + " active: " + dialysis.isActive() + ", takes " + dialysis.getDuration() + " hours");

        while (true) {
            if (HospitalInformation.getHourCount() >=24){
                System.out.println("Hospital is closed");
                break;
            }
            MedicalNotification n = HospitalInformation.getMedicalNotificationFromDoctor();

            int hour = HospitalInformation.getHourCount();
            System.out.println("Hour: " + hour);

            if (!n.getService().equals("None")){
                System.out.println("Request: " + n.getService() + " to " + n.getBay());
            }

            System.out.println("Bay: " + n.getBay());
            System.out.println("Service: " + n.getService());

            HospitalInformation.waitAnHour();
        }
    }
}