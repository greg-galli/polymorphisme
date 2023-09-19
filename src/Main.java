import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<MBDSStaff> staffList = new ArrayList<>();
        staffList.add(new Teacher("Gabriel Mopolo Moke"));
        staffList.add(new Teacher("Gregory Galli"));
        staffList.add(new Director("Michel Syska"));
        staffList.add(new Secretary("Caroline Poirier"));

        for (MBDSStaff staff : staffList)
        {
            staff.work();
        }

        /**
         * Should render :
         *
         * I do handle the teaching part !
         * I do handle the teaching part !
         * I do handle the MBDS Master degree
         * I do handle the registrations and all the paperwork
         */
    }
}
