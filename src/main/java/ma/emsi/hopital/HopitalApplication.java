package ma.emsi.hopital;

import ma.emsi.hopital.entities.Patient;
import ma.emsi.hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HopitalApplication implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository;
	public static void main(String[] args) {
		SpringApplication.run(HopitalApplication.class, args);
	}
	@Override
	public void run (String... args) throws Exception{
		// Filling the database :
//		patientRepository.save(new Patient(null , "Yassine" , new Date() , false, 12) );
//		patientRepository.save(new Patient(null , "John" , new Date() , true,14 ) );
//		patientRepository.save(new Patient(null , "Michael" , new Date() , false, 55) );
//		patientRepository.save(new Patient(null , "Emma" , new Date() , true, 78) );
//		patientRepository.save(new Patient(null , "Sophia" , new Date() , false, 5) );
//		patientRepository.save(new Patient(null , "Daniel" , new Date() , true,87 ) );
//		patientRepository.save(new Patient(null , "Olivia" , new Date() , false, 4) );
//		patientRepository.save(new Patient(null , "Alexander" , new Date() , true,9) );
//		patientRepository.save(new Patient(null , "Isabella" , new Date() , false,5845 ) );
//		patientRepository.save(new Patient(null , "William" , new Date() , true, 58) );
	}

}
