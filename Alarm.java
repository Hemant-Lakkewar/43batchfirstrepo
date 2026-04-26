import time
import datetime
import os

def set_alarm(alarm_time):
    print(f"Alarm set for {alarm_time}")
    
    while True:
        current_time = datetime.datetime.now().strftime("%H:%M:%S")
        print(f"Current time: {current_time}", end="\r")
        
        if current_time == alarm_time:
            print("\n⏰ Wake up! Alarm ringing!")
            
            # Play sound (Windows)
            try:
                import winsound
                winsound.Beep(1000, 1000)
            except:
                # For other systems, just print repeatedly
                for _ in range(5):
                    print("ALARM!")
                    time.sleep(1)
            break
        
        time.sleep(1)

# Input from user
alarm_time = input("Enter alarm time (HH:MM:SS): ")
set_alarm(alarm_time)
