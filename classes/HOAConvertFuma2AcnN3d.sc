HOAConverterFuma2AcnN3d{

	*ar { |order, in|
		case{order == 1}
                		{ var in1, // declare variables for the b-format array
			                    in2, in3, in4;
                               #in1, // distribute the channels from the array
			                     in2, in3, in4 = in;
			              ^HOAConverterFuma2AcnN3d1 .ar(in1, // return the Ugen with the b-format channels
				                                            in2, in3, in4)} // and with the args from the *ar method
		       {order == 2}
                		{var in1, // declare variables for the b-format array
			                   in2, in3, in4,
			                   in5, in6, in7, in8, in9;
                             #in1, // distribute the channels from the array
			                   in2, in3, in4,
			                   in5, in6, in7, in8, in9 = in;
			              ^HOAConverterFuma2AcnN3d2.ar(in1, // return the Ugen with the b-format channels
				                                            in2, in3, in4,
				                                            in5, in6, in7, in8, in9)} // and with the args from the *ar method
               {order == 3}
                		{var in1, // declare variables for the b-format array
			                   in2,   in3,   in4,
			                   in5,   in6,   in7,   in8,   in9,
			                   in10, in11, in12, in13, in14, in15, in16;
                              #in1, // distribute the channels from the array
			                    in2, in3, in4,
			                    in5, in6, in7, in8, in9,
			                    in10, in11, in12, in13, in14, in15, in16 = in;
			             ^HOAConverterFuma2AcnN3d3.ar(in1,  // return the Ugen with the b-format channels
				                                           in2, in3, in4,
				                                           in5, in6, in7, in8, in9,
				                                           in10, in11, in12, in13, in14, in15, in16 )} // and with the args from the *ar method
				{"this order is not implemented for HOAConverterFuma2AcnN3d".postln}
	}

}