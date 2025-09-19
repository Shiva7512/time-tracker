package training.taylor.timetracker.core;

import static org.junit.Assert.*;

import org.junit.Test;
import training.taylor.timetracker.core.dao.TimeEntry;

public class TrackerTest {

    @Test
    public void testMe() {
        Tracker tracker = new Tracker();
        assertNotNull(tracker);
    }

    @Test
    public void testAdd() {
        Tracker tracker = new Tracker();
        TimeEntry entry = new TimeEntry();
        entry.setDescription("Entry Test");
        entry.setRate(80.0f);
        entry.setTime(3);
        tracker.add(entry);
        assertTrue(tracker.size() > 0);
    }
}

