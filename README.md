# XtextToXMI
Transforming XText DSL to XMI file

At runtime create two files:

1. sample.mapping with the following content:
OBJ_brakeS_STD_StateMachine1_STATE_idle,_6IhhoAOCEeKTXbQztILh3g, STATE
OBJ_brakeS_STD_StateMachine1_STATE_braking,_63an8AOCEeKTXbQztILh3g, STATE

2. sample.trace with the following content:
FormalResults "Test" {
	FormalElement OBJ_brakeS_STD_StateMachine1_STATE_braking { 
		RefersToElement STATE {
			WithID _63an8AOCEeKTXbQztILh3g
			BelongsTo StateDiagram from UMLModel
			BackgroundColor HasTransformationTo "Blue"
		}
	},
	FormalElement OBJ_brakeS_STD_StateMachine1_STATE_idle { 
		RefersToElement STATE {
			WithID _6IhhoAOCEeKTXbQztILh3g
			BelongsTo StateDiagram from UMLModel
			BackgroundColor HasTransformationTo "Blue"
		}
	}
}

***OBS:*** Note that .trace file get FormalElement, RefersToElement, and WithID from .mapping file.


Right-click at sample.trace and New Submenu -> New Action to generate the XMI file.
