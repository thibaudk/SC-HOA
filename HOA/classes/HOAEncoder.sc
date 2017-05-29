HOAEncoder{
	*ar { |order, in, az=0, elev = 0, gain=0, plane_spherical = 0, radius=2, speaker_radius=1.07|
		case{order == 1}
		               {^FaustHOAEncoder1.ar( in1:in, gain_0:gain, radius_0:radius, azimuth_0:az, elevation_0:elev, yes:plane_spherical, speaker_radius_0:speaker_radius )}
		       {order == 2}
                		{^FaustHOAEncoder2.ar(in1:in, gain_0:gain, radius_0:radius, azimuth_0:az, elevation_0:elev, yes:plane_spherical, speaker_radius_0:speaker_radius)}
               {order == 3}
                		{^FaustHOAEncoder3.ar(in1:in, gain_0:gain, radius_0:radius, azimuth_0:az, elevation_0:elev, yes:plane_spherical, speaker_radius_0:speaker_radius)}
               {order == 4}
                		{^FaustHOAEncoder4.ar(in1:in, gain_0:gain, radius_0:radius, azimuth_0:az, elevation_0:elev, yes:plane_spherical, speaker_radius_0:speaker_radius)}
               {order == 5}
                		{^FaustHOAEncoder5.ar(in1:in, gain_0:gain, radius_0:radius, azimuth_0:az, elevation_0:elev, yes:plane_spherical, speaker_radius_0:speaker_radius)}
		       {"this order is not implemented for HOAEncPan".postln;}
	}
}