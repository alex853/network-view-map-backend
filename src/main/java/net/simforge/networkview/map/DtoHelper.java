package net.simforge.networkview.map;

public class DtoHelper {
    public static PilotPositionDto getPilotPositionDto(ReportPilotPosition reportPilotPosition/*, Position position*/) {
        PilotPositionDto pilotPositionDto = new PilotPositionDto();

        pilotPositionDto.setPilotNumber(reportPilotPosition.getPilotNumber());
        pilotPositionDto.setCallsign(reportPilotPosition.getCallsign());
//        pilotPositionDto.setStatus(position.getStatus());
        pilotPositionDto.setLatitude(reportPilotPosition.getLatitude());
        pilotPositionDto.setLongitude(reportPilotPosition.getLongitude());
        pilotPositionDto.setHeading(reportPilotPosition.getHeading());
        pilotPositionDto.setGroundspeed(reportPilotPosition.getGroundspeed());
        pilotPositionDto.setAltitude(String.valueOf(reportPilotPosition.getAltitude()));
//        pilotPositionDto.setType(ParsingLogics.parseAircraftType(reportPilotPosition.getFpAircraft()));
        pilotPositionDto.setRegNo(reportPilotPosition.getParsedRegNo());

        pilotPositionDto.setFpOrigin(reportPilotPosition.getFpOrigin());
//        Airport airport = Airports.get().getByIcao(reportPilotPosition.getFpOrigin());
//        if (airport != null) {
//            pilotPositionDto.setFpOriginCoords(airport.getCoords());
//        }

        pilotPositionDto.setFpDestination(reportPilotPosition.getFpDestination());
//        airport = Airports.get().getByIcao(reportPilotPosition.getFpDestination());
//        if (airport != null) {
//            pilotPositionDto.setFpDestinationCoords(airport.getCoords());
//        }
        return pilotPositionDto;
    }
}
