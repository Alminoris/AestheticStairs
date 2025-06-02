package net.alminoris.aestheticstairs.util.helper;

public class ModJsonTemplates
{
    public static String SHAPED_RECIPE = """
            {
              "type": "minecraft:crafting_shaped",
              "category": "building",
              "key": {
                "#": {
                  "item": "INGREDIENT1_NAME"
                },
                "/": {
                  "item": "INGREDIENT2_NAME"
                }
              },
              "pattern": [
                PATTERN1
                PATTERN2
                PATTERN3
              ],
              "result": {
                "count": COUNT,
                "id": "aestheticstairs:OUTPUT_NAME"
              }
            }
            """;

    public static String SHAPED1_RECIPE = """
            {
              "type": "minecraft:crafting_shaped",
              "category": "building",
              "key": {
                "#": {
                  "item": "INGREDIENT1_NAME"
                }
              },
              "pattern": [
                PATTERN1
                PATTERN2
                PATTERN3
              ],
              "result": {
                "count": COUNT,
                "item": "aestheticstairs:OUTPUT_NAME"
              }
            }
            """;

    public static String STAIRCASE_BLOCKSTATE = """
            {
              "variants": {
                "facing=north,variant=normal,railed=false": { "model": "aestheticstairs:block/NAME" },
                "facing=south,variant=normal,railed=false": { "model": "aestheticstairs:block/NAME", "y": 180 },
                "facing=west,variant=normal,railed=false": { "model": "aestheticstairs:block/NAME", "y": 270 },
                "facing=east,variant=normal,railed=false": { "model": "aestheticstairs:block/NAME", "y": 90 },
                "facing=north,variant=left,railed=false": { "model": "aestheticstairs:block/NAME_left" },
                "facing=south,variant=left,railed=false": { "model": "aestheticstairs:block/NAME_left", "y": 180 },
                "facing=west,variant=left,railed=false": { "model": "aestheticstairs:block/NAME_left", "y": 270 },
                "facing=east,variant=left,railed=false": { "model": "aestheticstairs:block/NAME_left", "y": 90 },
                "facing=north,variant=right,railed=false": { "model": "aestheticstairs:block/NAME_right" },
                "facing=south,variant=right,railed=false": { "model": "aestheticstairs:block/NAME_right", "y": 180 },
                "facing=west,variant=right,railed=false": { "model": "aestheticstairs:block/NAME_right", "y": 270 },
                "facing=east,variant=right,railed=false": { "model": "aestheticstairs:block/NAME_right", "y": 90 },
                "facing=north,variant=center,railed=false": { "model": "aestheticstairs:block/NAME_center" },
                "facing=south,variant=center,railed=false": { "model": "aestheticstairs:block/NAME_center", "y": 180 },
                "facing=west,variant=center,railed=false": { "model": "aestheticstairs:block/NAME_center", "y": 270 },
                "facing=east,variant=center,railed=false": { "model": "aestheticstairs:block/NAME_center", "y": 90 },
                "facing=north,variant=up,railed=false": { "model": "aestheticstairs:block/NAME_up" },
                "facing=south,variant=up,railed=false": { "model": "aestheticstairs:block/NAME_up", "y": 180 },
                "facing=west,variant=up,railed=false": { "model": "aestheticstairs:block/NAME_up", "y": 270 },
                "facing=east,variant=up,railed=false": { "model": "aestheticstairs:block/NAME_up", "y": 90 },
                "facing=north,variant=upleft,railed=false": { "model": "aestheticstairs:block/NAME_upleft" },
                "facing=south,variant=upleft,railed=false": { "model": "aestheticstairs:block/NAME_upleft", "y": 180 },
                "facing=west,variant=upleft,railed=false": { "model": "aestheticstairs:block/NAME_upleft", "y": 270 },
                "facing=east,variant=upleft,railed=false": { "model": "aestheticstairs:block/NAME_upleft", "y": 90 },
                "facing=north,variant=upright,railed=false": { "model": "aestheticstairs:block/NAME_upright" },
                "facing=south,variant=upright,railed=false": { "model": "aestheticstairs:block/NAME_upright", "y": 180 },
                "facing=west,variant=upright,railed=false": { "model": "aestheticstairs:block/NAME_upright", "y": 270 },
                "facing=east,variant=upright,railed=false": { "model": "aestheticstairs:block/NAME_upright", "y": 90 },
                "facing=north,variant=upcenter,railed=false": { "model": "aestheticstairs:block/NAME_upcenter" },
                "facing=south,variant=upcenter,railed=false": { "model": "aestheticstairs:block/NAME_upcenter", "y": 180 },
                "facing=west,variant=upcenter,railed=false": { "model": "aestheticstairs:block/NAME_upcenter", "y": 270 },
                "facing=east,variant=upcenter,railed=false": { "model": "aestheticstairs:block/NAME_upcenter", "y": 90 },
                "facing=north,variant=leftcorner,railed=false": { "model": "aestheticstairs:block/NAME_leftcorner" },
                "facing=south,variant=leftcorner,railed=false": { "model": "aestheticstairs:block/NAME_leftcorner", "y": 180 },
                "facing=west,variant=leftcorner,railed=false": { "model": "aestheticstairs:block/NAME_leftcorner", "y": 270 },
                "facing=east,variant=leftcorner,railed=false": { "model": "aestheticstairs:block/NAME_leftcorner", "y": 90 },
                "facing=north,variant=rightcorner,railed=false": { "model": "aestheticstairs:block/NAME_rightcorner" },
                "facing=south,variant=rightcorner,railed=false": { "model": "aestheticstairs:block/NAME_rightcorner", "y": 180 },
                "facing=west,variant=rightcorner,railed=false": { "model": "aestheticstairs:block/NAME_rightcorner", "y": 270 },
                "facing=east,variant=rightcorner,railed=false": { "model": "aestheticstairs:block/NAME_rightcorner", "y": 90 },
                "facing=north,variant=normal,railed=true": { "model": "aestheticstairs:block/NAME_railed" },
                "facing=south,variant=normal,railed=true": { "model": "aestheticstairs:block/NAME_railed", "y": 180 },
                "facing=west,variant=normal,railed=true": { "model": "aestheticstairs:block/NAME_railed", "y": 270 },
                "facing=east,variant=normal,railed=true": { "model": "aestheticstairs:block/NAME_railed", "y": 90 },
                "facing=north,variant=left,railed=true": { "model": "aestheticstairs:block/NAME_left_railed" },
                "facing=south,variant=left,railed=true": { "model": "aestheticstairs:block/NAME_left_railed", "y": 180 },
                "facing=west,variant=left,railed=true": { "model": "aestheticstairs:block/NAME_left_railed", "y": 270 },
                "facing=east,variant=left,railed=true": { "model": "aestheticstairs:block/NAME_left_railed", "y": 90 },
                "facing=north,variant=right,railed=true": { "model": "aestheticstairs:block/NAME_right_railed" },
                "facing=south,variant=right,railed=true": { "model": "aestheticstairs:block/NAME_right_railed", "y": 180 },
                "facing=west,variant=right,railed=true": { "model": "aestheticstairs:block/NAME_right_railed", "y": 270 },
                "facing=east,variant=right,railed=true": { "model": "aestheticstairs:block/NAME_right_railed", "y": 90 },
                "facing=north,variant=center,railed=true": { "model": "aestheticstairs:block/NAME_center" },
                "facing=south,variant=center,railed=true": { "model": "aestheticstairs:block/NAME_center", "y": 180 },
                "facing=west,variant=center,railed=true": { "model": "aestheticstairs:block/NAME_center", "y": 270 },
                "facing=east,variant=center,railed=true": { "model": "aestheticstairs:block/NAME_center", "y": 90 },
                "facing=north,variant=up,railed=true": { "model": "aestheticstairs:block/NAME_up_railed" },
                "facing=south,variant=up,railed=true": { "model": "aestheticstairs:block/NAME_up_railed", "y": 180 },
                "facing=west,variant=up,railed=true": { "model": "aestheticstairs:block/NAME_up_railed", "y": 270 },
                "facing=east,variant=up,railed=true": { "model": "aestheticstairs:block/NAME_up_railed", "y": 90 },
                "facing=north,variant=upleft,railed=true": { "model": "aestheticstairs:block/NAME_upleft_railed" },
                "facing=south,variant=upleft,railed=true": { "model": "aestheticstairs:block/NAME_upleft_railed", "y": 180 },
                "facing=west,variant=upleft,railed=true": { "model": "aestheticstairs:block/NAME_upleft_railed", "y": 270 },
                "facing=east,variant=upleft,railed=true": { "model": "aestheticstairs:block/NAME_upleft_railed", "y": 90 },
                "facing=north,variant=upright,railed=true": { "model": "aestheticstairs:block/NAME_upright_railed" },
                "facing=south,variant=upright,railed=true": { "model": "aestheticstairs:block/NAME_upright_railed", "y": 180 },
                "facing=west,variant=upright,railed=true": { "model": "aestheticstairs:block/NAME_upright_railed", "y": 270 },
                "facing=east,variant=upright,railed=true": { "model": "aestheticstairs:block/NAME_upright_railed", "y": 90 },
                "facing=north,variant=upcenter,railed=true": { "model": "aestheticstairs:block/NAME_upcenter" },
                "facing=south,variant=upcenter,railed=true": { "model": "aestheticstairs:block/NAME_upcenter", "y": 180 },
                "facing=west,variant=upcenter,railed=true": { "model": "aestheticstairs:block/NAME_upcenter", "y": 270 },
                "facing=east,variant=upcenter,railed=true": { "model": "aestheticstairs:block/NAME_upcenter", "y": 90 },
                "facing=north,variant=leftcorner,railed=true": { "model": "aestheticstairs:block/NAME_leftcorner" },
                "facing=south,variant=leftcorner,railed=true": { "model": "aestheticstairs:block/NAME_leftcorner", "y": 180 },
                "facing=west,variant=leftcorner,railed=true": { "model": "aestheticstairs:block/NAME_leftcorner", "y": 270 },
                "facing=east,variant=leftcorner,railed=true": { "model": "aestheticstairs:block/NAME_leftcorner", "y": 90 },
                "facing=north,variant=rightcorner,railed=true": { "model": "aestheticstairs:block/NAME_rightcorner" },
                "facing=south,variant=rightcorner,railed=true": { "model": "aestheticstairs:block/NAME_rightcorner", "y": 180 },
                "facing=west,variant=rightcorner,railed=true": { "model": "aestheticstairs:block/NAME_rightcorner", "y": 270 },
                "facing=east,variant=rightcorner,railed=true": { "model": "aestheticstairs:block/NAME_rightcorner", "y": 90 }
              }
            }
            """;

    public static String STAIRAIL_BLOCKSTATE = """
            {
              "variants": {
                "facing=north,variant=normal": { "model": "aestheticstairs:block/NAME" },
                "facing=south,variant=normal": { "model": "aestheticstairs:block/NAME", "y": 180 },
                "facing=west,variant=normal": { "model": "aestheticstairs:block/NAME", "y": 270 },
                "facing=east,variant=normal": { "model": "aestheticstairs:block/NAME", "y": 90 },
                "facing=north,variant=side": { "model": "aestheticstairs:block/NAME_side" },
                "facing=south,variant=side": { "model": "aestheticstairs:block/NAME_side", "y": 180 },
                "facing=west,variant=side": { "model": "aestheticstairs:block/NAME_side", "y": 270 },
                "facing=east,variant=side": { "model": "aestheticstairs:block/NAME_side", "y": 90 },
                "facing=north,variant=leftcorner": { "model": "aestheticstairs:block/NAME_leftcorner" },
                "facing=south,variant=leftcorner": { "model": "aestheticstairs:block/NAME_leftcorner", "y": 180 },
                "facing=west,variant=leftcorner": { "model": "aestheticstairs:block/NAME_leftcorner", "y": 270 },
                "facing=east,variant=leftcorner": { "model": "aestheticstairs:block/NAME_leftcorner", "y": 90 },
                "facing=north,variant=rightcorner": { "model": "aestheticstairs:block/NAME_rightcorner" },
                "facing=south,variant=rightcorner": { "model": "aestheticstairs:block/NAME_rightcorner", "y": 180 },
                "facing=west,variant=rightcorner": { "model": "aestheticstairs:block/NAME_rightcorner", "y": 270 },
                "facing=east,variant=rightcorner": { "model": "aestheticstairs:block/NAME_rightcorner", "y": 90 }
              }
            }
            """;

    public static String STAIRCASE = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 7, 0],
            			"to": [16, 10, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 8],
            			"to": [16, 3, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 12]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [5, -0.00591, 4.96031],
            			"to": [11, 9.74409, 6.96031],
            			"rotation": {"angle": -45, "axis": "x", "origin": [8, 4.86909, 5.96031]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 9.75], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 9.75], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 9.75], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 9.75], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 2], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [4, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [4, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 1.5, -0.5],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String STAIRCASE_UP = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 7, 0],
            			"to": [16, 10, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 8],
            			"to": [16, 3, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 12]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [5, -8.8207, 12.6501],
            			"to": [11, 3.1793, 14.6501],
            			"rotation": {"angle": -45, "axis": "x", "origin": [8, -2.8207, 13.6501]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 12], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 12], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [5, -0.00591, 4.96031],
            			"to": [11, 9.74409, 6.96031],
            			"rotation": {"angle": -45, "axis": "x", "origin": [8, 4.86909, 5.96031]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 9.75], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 9.75], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 9.75], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 9.75], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 2], "texture": "#1"}
            			}
            		}
            	]
            }
            """;

    public static String STAIRCASE_LEFT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 7, 0],
            			"to": [16, 10, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 8],
            			"to": [16, 3, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 12]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, -0.00591, 4.96031],
            			"to": [8, 9.74409, 6.96031],
            			"rotation": {"angle": -45, "axis": "x", "origin": [5, 4.86909, 5.96031]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 9.75], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 9.75], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 9.75], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 9.75], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 2], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [4, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [4, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 1.5, -0.5],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String STAIRCASE_RIGHT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 7, 0],
            			"to": [16, 10, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 8],
            			"to": [16, 3, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 12]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [8, -0.00591, 4.96031],
            			"to": [14, 9.74409, 6.96031],
            			"rotation": {"angle": -45, "axis": "x", "origin": [11, 4.86909, 5.96031]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 9.75], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 9.75], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 9.75], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 9.75], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 2], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [4, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [4, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 1.5, -0.5],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String STAIRCASE_CENTER = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 7, 0],
            			"to": [16, 10, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 8],
            			"to": [16, 3, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 12]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [4, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [4, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 1.5, -0.5],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String STAIRCASE_UPLEFT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 7, 0],
            			"to": [16, 10, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 8],
            			"to": [16, 3, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 12]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, -8.8207, 12.6501],
            			"to": [8, 3.1793, 14.6501],
            			"rotation": {"angle": -45, "axis": "x", "origin": [5, -2.8207, 13.6501]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 12], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 12], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [2, -0.00591, 4.96031],
            			"to": [8, 9.74409, 6.96031],
            			"rotation": {"angle": -45, "axis": "x", "origin": [5, 4.86909, 5.96031]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 9.75], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 9.75], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 9.75], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 9.75], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 2], "texture": "#1"}
            			}
            		}
            	]
            }
            """;

    public static String STAIRCASE_UPRIGHT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 7, 0],
            			"to": [16, 10, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 8],
            			"to": [16, 3, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 12]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [8, -8.8207, 12.6501],
            			"to": [14, 3.1793, 14.6501],
            			"rotation": {"angle": -45, "axis": "x", "origin": [11, -2.8207, 13.6501]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 12], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 12], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [8, -0.00591, 4.96031],
            			"to": [14, 9.74409, 6.96031],
            			"rotation": {"angle": -45, "axis": "x", "origin": [11, 4.86909, 5.96031]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 9.75], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 9.75], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 9.75], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 9.75], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 2], "texture": "#1"}
            			}
            		}
            	]
            }
            """;

    public static String STAIRCASE_UPCENTER = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 7, 0],
            			"to": [16, 10, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 8],
            			"to": [16, 3, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 12]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		}
            	]
            }
            """;

    public static String STAIRCASE_LEFTCORNER = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 7, 0],
            			"to": [16, 10, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 7, 8],
            			"to": [8, 10, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 8.5, 12]},
            			"faces": {
            				"north": {"uv": [0, 8, 8, 11], "texture": "#0"},
            				"east": {"uv": [0, 8, 8, 11], "texture": "#0"},
            				"south": {"uv": [0, 8, 8, 11], "texture": "#0"},
            				"west": {"uv": [0, 8, 8, 11], "texture": "#0"},
            				"up": {"uv": [0, 8, 8, 16], "texture": "#0"},
            				"down": {"uv": [0, 8, 8, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [8, 0, 8],
            			"to": [16, 3, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12, 1.5, 12]},
            			"faces": {
            				"north": {"uv": [8, 8, 16, 11], "texture": "#0"},
            				"east": {"uv": [8, 8, 16, 11], "texture": "#0"},
            				"south": {"uv": [8, 8, 16, 11], "texture": "#0"},
            				"west": {"uv": [8, 8, 16, 11], "texture": "#0"},
            				"up": {"uv": [8, 8, 16, 16], "texture": "#0"},
            				"down": {"uv": [8, 8, 16, 16], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [4, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [4, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 1.5, -0.5],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String STAIRCASE_RIGHTCORNER = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 7, 0],
            			"to": [16, 10, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [8, 7, 8],
            			"to": [16, 10, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12, 8.5, 12]},
            			"faces": {
            				"north": {"uv": [8, 8, 16, 11], "texture": "#0"},
            				"east": {"uv": [8, 8, 16, 11], "texture": "#0"},
            				"south": {"uv": [8, 8, 16, 11], "texture": "#0"},
            				"west": {"uv": [8, 8, 16, 11], "texture": "#0"},
            				"up": {"uv": [8, 8, 16, 16], "texture": "#0"},
            				"down": {"uv": [8, 8, 16, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 8],
            			"to": [8, 3, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 1.5, 12]},
            			"faces": {
            				"north": {"uv": [0, 8, 8, 11], "texture": "#0"},
            				"east": {"uv": [0, 8, 8, 11], "texture": "#0"},
            				"south": {"uv": [0, 8, 8, 11], "texture": "#0"},
            				"west": {"uv": [0, 8, 8, 11], "texture": "#0"},
            				"up": {"uv": [0, 8, 8, 16], "texture": "#0"},
            				"down": {"uv": [0, 8, 8, 16], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [4, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [4, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 1.5, -0.5],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String STAIRCASE_RAILED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 7, 0],
            			"to": [16, 10, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 8],
            			"to": [16, 3, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 12]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [5, -0.00591, 4.96031],
            			"to": [11, 9.74409, 6.96031],
            			"rotation": {"angle": -45, "axis": "x", "origin": [8, 4.86909, 5.96031]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 9.75], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 9.75], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 9.75], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 9.75], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-3, 0, 10],
            			"to": [0, 3, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 0, 14]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3, 3, 6],
            			"to": [0, 7, 10],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 4, 10]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16, 3, 6],
            			"to": [19, 7, 10],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17, 4, 10]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16, 0, 10],
            			"to": [19, 3, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17, 0, 14]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16, 7, 2],
            			"to": [19, 10, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17, 7, 6]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16.001, 4.51872, 2.15628],
            			"to": [19.001, 7.51872, 7.90628],
            			"rotation": {"angle": 45, "axis": "x", "origin": [17.501, 6.01872, 5.03128]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 5.75, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 5.75, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 5.75], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 5.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3.001, 4.51872, 2.15628],
            			"to": [-0.001, 7.51872, 7.90628],
            			"rotation": {"angle": 45, "axis": "x", "origin": [-1.501, 6.01872, 5.03128]},
            			"faces": {
            				"north": {"uv": [3, 0, 0, 3], "texture": "#0"},
            				"east": {"uv": [5.75, 0, 0, 3], "texture": "#0"},
            				"south": {"uv": [3, 0, 0, 3], "texture": "#0"},
            				"west": {"uv": [5.75, 0, 0, 3], "texture": "#0"},
            				"up": {"uv": [3, 0, 0, 5.75], "texture": "#0"},
            				"down": {"uv": [3, 0, 0, 5.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3.001, 1.43943, 6.61339],
            			"to": [-0.001, 3.53943, 11.46339],
            			"rotation": {"angle": 45, "axis": "x", "origin": [-1.501, 2.48943, 9.03839]},
            			"faces": {
            				"north": {"uv": [3, 0, 6, 2.1], "texture": "#0"},
            				"east": {"uv": [5.75, 0, 10.6, 2.1], "texture": "#0"},
            				"south": {"uv": [3, 0, 6, 2.1], "texture": "#0"},
            				"west": {"uv": [5.75, 0, 10.6, 2.1], "texture": "#0"},
            				"up": {"uv": [3, 0, 6, 4.85], "texture": "#0"},
            				"down": {"uv": [3, 0, 6, 4.85], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16.001, 1.43943, 6.61339],
            			"to": [19.001, 3.53943, 11.46339],
            			"rotation": {"angle": 45, "axis": "x", "origin": [17.501, 2.48943, 9.03839]},
            			"faces": {
            				"north": {"uv": [6, 0, 3, 2.1], "texture": "#0"},
            				"east": {"uv": [10.6, 0, 5.75, 2.1], "texture": "#0"},
            				"south": {"uv": [6, 0, 3, 2.1], "texture": "#0"},
            				"west": {"uv": [10.6, 0, 5.75, 2.1], "texture": "#0"},
            				"up": {"uv": [6, 0, 3, 4.85], "texture": "#0"},
            				"down": {"uv": [6, 0, 3, 4.85], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3, 7, 2],
            			"to": [0, 10, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 7, 6]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-2.5, 3, 11],
            			"to": [-0.5, 14.65, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-1.5, 9.875, 12]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 11.65], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 11.65], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 11.65], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 11.65], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-2.5, 7, 7],
            			"to": [-0.5, 18.6, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-1.5, 12.7, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 11.6], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 11.6], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 11.6], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 11.6], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-2.5, 10, 3],
            			"to": [-0.5, 22.6, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-1.5, 15, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12.6], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12.6], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 12.6], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12.6], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-2.5, 22.6, 3],
            			"to": [-0.5, 23.6, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-1.5, 23.1, 3.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-2.5, 18.6, 7],
            			"to": [-0.5, 19.6, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-1.5, 19.1, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-2.5, 14.6, 11],
            			"to": [-0.5, 15.6, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-1.5, 15.1, 11.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [16.5, 22.6, 3],
            			"to": [18.5, 23.6, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17.5, 23.1, 3.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"east": {"uv": [1, 0, 0, 1], "texture": "#1"},
            				"south": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"west": {"uv": [1, 0, 0, 1], "texture": "#1"},
            				"up": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [16.5, 18.6, 7],
            			"to": [18.5, 19.6, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17.5, 19.1, 7.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"east": {"uv": [1, 0, 0, 1], "texture": "#1"},
            				"south": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"west": {"uv": [1, 0, 0, 1], "texture": "#1"},
            				"up": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [16.5, 14.6, 11],
            			"to": [18.5, 15.6, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17.5, 15.1, 11.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"east": {"uv": [1, 0, 0, 1], "texture": "#1"},
            				"south": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"west": {"uv": [1, 0, 0, 1], "texture": "#1"},
            				"up": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-3, 17.59099, -2.34099],
            			"to": [0, 18.59099, 20.15901],
            			"rotation": {"angle": 45, "axis": "x", "origin": [-1.5, 18.09099, 8.90901]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 1], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 1], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 16], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16, 17.59099, -2.34099],
            			"to": [19, 18.59099, 20.15901],
            			"rotation": {"angle": 45, "axis": "x", "origin": [17.5, 18.09099, 8.90901]},
            			"faces": {
            				"north": {"uv": [3, 0, 0, 1], "texture": "#0"},
            				"east": {"uv": [16, 0, 0, 1], "texture": "#0"},
            				"south": {"uv": [3, 0, 0, 1], "texture": "#0"},
            				"west": {"uv": [16, 0, 0, 1], "texture": "#0"},
            				"up": {"uv": [3, 0, 0, 16], "texture": "#0"},
            				"down": {"uv": [3, 0, 0, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16.5, 3, 11],
            			"to": [18.5, 14.65, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17.5, 9.875, 12]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 11.65], "texture": "#1"},
            				"east": {"uv": [2, 0, 0, 11.65], "texture": "#1"},
            				"south": {"uv": [2, 0, 0, 11.65], "texture": "#1"},
            				"west": {"uv": [2, 0, 0, 11.65], "texture": "#1"},
            				"up": {"uv": [2, 0, 0, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [16.5, 7, 7],
            			"to": [18.5, 18.6, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17.5, 12.7, 8]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 11.6], "texture": "#1"},
            				"east": {"uv": [2, 0, 0, 11.6], "texture": "#1"},
            				"south": {"uv": [2, 0, 0, 11.6], "texture": "#1"},
            				"west": {"uv": [2, 0, 0, 11.6], "texture": "#1"},
            				"up": {"uv": [2, 0, 0, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [16.5, 10, 3],
            			"to": [18.5, 22.6, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17.5, 15, 4]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 12.6], "texture": "#1"},
            				"east": {"uv": [2, 0, 0, 12.6], "texture": "#1"},
            				"south": {"uv": [2, 0, 0, 12.6], "texture": "#1"},
            				"west": {"uv": [2, 0, 0, 12.6], "texture": "#1"},
            				"up": {"uv": [2, 0, 0, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [4, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [4, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 1.5, -0.5],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		0,
            		1,
            		2,
            		{
            			"name": "rails",
            			"origin": [17.5, 15, 4],
            			"color": 0,
            			"children": [3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26]
            		}
            	]
            }
            """;

    public static String STAIRCASE_UP_RAILED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 7, 0],
            			"to": [16, 10, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 8],
            			"to": [16, 3, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 12]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [5, -8.8207, 12.6501],
            			"to": [11, 3.1793, 14.6501],
            			"rotation": {"angle": -45, "axis": "x", "origin": [8, -2.8207, 13.6501]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 12], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 12], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [5, -0.00591, 4.96031],
            			"to": [11, 9.74409, 6.96031],
            			"rotation": {"angle": -45, "axis": "x", "origin": [8, 4.86909, 5.96031]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 9.75], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 9.75], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 9.75], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 9.75], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-3, 0, 10],
            			"to": [0, 3, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 0, 14]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3, 3, 6],
            			"to": [0, 7, 10],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 4, 10]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16, 3, 6],
            			"to": [19, 7, 10],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17, 4, 10]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16, 0, 10],
            			"to": [19, 3, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17, 0, 14]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16, 7, 2],
            			"to": [19, 10, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17, 7, 6]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16.001, 4.51872, 2.15628],
            			"to": [19.001, 7.51872, 7.90628],
            			"rotation": {"angle": 45, "axis": "x", "origin": [17.501, 6.01872, 5.03128]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 5.75, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 5.75, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 5.75], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 5.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3.001, 4.51872, 2.15628],
            			"to": [-0.001, 7.51872, 7.90628],
            			"rotation": {"angle": 45, "axis": "x", "origin": [-1.501, 6.01872, 5.03128]},
            			"faces": {
            				"north": {"uv": [3, 0, 0, 3], "texture": "#0"},
            				"east": {"uv": [5.75, 0, 0, 3], "texture": "#0"},
            				"south": {"uv": [3, 0, 0, 3], "texture": "#0"},
            				"west": {"uv": [5.75, 0, 0, 3], "texture": "#0"},
            				"up": {"uv": [3, 0, 0, 5.75], "texture": "#0"},
            				"down": {"uv": [3, 0, 0, 5.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3.001, 1.43943, 6.61339],
            			"to": [-0.001, 3.53943, 11.46339],
            			"rotation": {"angle": 45, "axis": "x", "origin": [-1.501, 2.48943, 9.03839]},
            			"faces": {
            				"north": {"uv": [3, 0, 6, 2.1], "texture": "#0"},
            				"east": {"uv": [5.75, 0, 10.6, 2.1], "texture": "#0"},
            				"south": {"uv": [3, 0, 6, 2.1], "texture": "#0"},
            				"west": {"uv": [5.75, 0, 10.6, 2.1], "texture": "#0"},
            				"up": {"uv": [3, 0, 6, 4.85], "texture": "#0"},
            				"down": {"uv": [3, 0, 6, 4.85], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16.001, 1.43943, 6.61339],
            			"to": [19.001, 3.53943, 11.46339],
            			"rotation": {"angle": 45, "axis": "x", "origin": [17.501, 2.48943, 9.03839]},
            			"faces": {
            				"north": {"uv": [6, 0, 3, 2.1], "texture": "#0"},
            				"east": {"uv": [10.6, 0, 5.75, 2.1], "texture": "#0"},
            				"south": {"uv": [6, 0, 3, 2.1], "texture": "#0"},
            				"west": {"uv": [10.6, 0, 5.75, 2.1], "texture": "#0"},
            				"up": {"uv": [6, 0, 3, 4.85], "texture": "#0"},
            				"down": {"uv": [6, 0, 3, 4.85], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3, 7, 2],
            			"to": [0, 10, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 7, 6]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-2.5, 3, 11],
            			"to": [-0.5, 14.65, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-1.5, 9.875, 12]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 11.65], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 11.65], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 11.65], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 11.65], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-2.5, 7, 7],
            			"to": [-0.5, 18.6, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-1.5, 12.7, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 11.6], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 11.6], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 11.6], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 11.6], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-2.5, 10, 3],
            			"to": [-0.5, 22.6, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-1.5, 15, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12.6], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12.6], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 12.6], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12.6], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-2.5, 22.6, 3],
            			"to": [-0.5, 23.6, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-1.5, 23.1, 3.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-2.5, 18.6, 7],
            			"to": [-0.5, 19.6, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-1.5, 19.1, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-2.5, 14.6, 11],
            			"to": [-0.5, 15.6, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-1.5, 15.1, 11.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [16.5, 22.6, 3],
            			"to": [18.5, 23.6, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17.5, 23.1, 3.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"east": {"uv": [1, 0, 0, 1], "texture": "#1"},
            				"south": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"west": {"uv": [1, 0, 0, 1], "texture": "#1"},
            				"up": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [16.5, 18.6, 7],
            			"to": [18.5, 19.6, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17.5, 19.1, 7.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"east": {"uv": [1, 0, 0, 1], "texture": "#1"},
            				"south": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"west": {"uv": [1, 0, 0, 1], "texture": "#1"},
            				"up": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [16.5, 14.6, 11],
            			"to": [18.5, 15.6, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17.5, 15.1, 11.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"east": {"uv": [1, 0, 0, 1], "texture": "#1"},
            				"south": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"west": {"uv": [1, 0, 0, 1], "texture": "#1"},
            				"up": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-3, 17.59099, -2.34099],
            			"to": [0, 18.59099, 20.15901],
            			"rotation": {"angle": 45, "axis": "x", "origin": [-1.5, 18.09099, 8.90901]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 1], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 1], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 16], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16, 17.59099, -2.34099],
            			"to": [19, 18.59099, 20.15901],
            			"rotation": {"angle": 45, "axis": "x", "origin": [17.5, 18.09099, 8.90901]},
            			"faces": {
            				"north": {"uv": [3, 0, 0, 1], "texture": "#0"},
            				"east": {"uv": [16, 0, 0, 1], "texture": "#0"},
            				"south": {"uv": [3, 0, 0, 1], "texture": "#0"},
            				"west": {"uv": [16, 0, 0, 1], "texture": "#0"},
            				"up": {"uv": [3, 0, 0, 16], "texture": "#0"},
            				"down": {"uv": [3, 0, 0, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16.5, 3, 11],
            			"to": [18.5, 14.65, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17.5, 9.875, 12]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 11.65], "texture": "#1"},
            				"east": {"uv": [2, 0, 0, 11.65], "texture": "#1"},
            				"south": {"uv": [2, 0, 0, 11.65], "texture": "#1"},
            				"west": {"uv": [2, 0, 0, 11.65], "texture": "#1"},
            				"up": {"uv": [2, 0, 0, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [16.5, 7, 7],
            			"to": [18.5, 18.6, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17.5, 12.7, 8]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 11.6], "texture": "#1"},
            				"east": {"uv": [2, 0, 0, 11.6], "texture": "#1"},
            				"south": {"uv": [2, 0, 0, 11.6], "texture": "#1"},
            				"west": {"uv": [2, 0, 0, 11.6], "texture": "#1"},
            				"up": {"uv": [2, 0, 0, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [16.5, 10, 3],
            			"to": [18.5, 22.6, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17.5, 15, 4]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 12.6], "texture": "#1"},
            				"east": {"uv": [2, 0, 0, 12.6], "texture": "#1"},
            				"south": {"uv": [2, 0, 0, 12.6], "texture": "#1"},
            				"west": {"uv": [2, 0, 0, 12.6], "texture": "#1"},
            				"up": {"uv": [2, 0, 0, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
            			}
            		}
            	],
            	"groups": [
            		0,
            		1,
            		2,
            		3,
            		{
            			"name": "rails",
            			"origin": [17.5, 15, 4],
            			"color": 0,
            			"children": [4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27]
            		}
            	]
            }
            """;

    public static String STAIRCASE_LEFT_RAILED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 7, 0],
            			"to": [16, 10, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 8],
            			"to": [16, 3, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 12]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, -0.00591, 4.96031],
            			"to": [8, 9.74409, 6.96031],
            			"rotation": {"angle": -45, "axis": "x", "origin": [5, 4.86909, 5.96031]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 9.75], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 9.75], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 9.75], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 9.75], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-3, 0, 10],
            			"to": [0, 3, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 0, 14]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3, 3, 6],
            			"to": [0, 7, 10],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 4, 10]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3.001, 4.51872, 2.15628],
            			"to": [-0.001, 7.51872, 7.90628],
            			"rotation": {"angle": 45, "axis": "x", "origin": [-1.501, 6.01872, 5.03128]},
            			"faces": {
            				"north": {"uv": [3, 0, 0, 3], "texture": "#0"},
            				"east": {"uv": [5.75, 0, 0, 3], "texture": "#0"},
            				"south": {"uv": [3, 0, 0, 3], "texture": "#0"},
            				"west": {"uv": [5.75, 0, 0, 3], "texture": "#0"},
            				"up": {"uv": [3, 0, 0, 5.75], "texture": "#0"},
            				"down": {"uv": [3, 0, 0, 5.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3.001, 1.43943, 6.61339],
            			"to": [-0.001, 3.53943, 11.46339],
            			"rotation": {"angle": 45, "axis": "x", "origin": [-1.501, 2.48943, 9.03839]},
            			"faces": {
            				"north": {"uv": [3, 0, 6, 2.1], "texture": "#0"},
            				"east": {"uv": [5.75, 0, 10.6, 2.1], "texture": "#0"},
            				"south": {"uv": [3, 0, 6, 2.1], "texture": "#0"},
            				"west": {"uv": [5.75, 0, 10.6, 2.1], "texture": "#0"},
            				"up": {"uv": [3, 0, 6, 4.85], "texture": "#0"},
            				"down": {"uv": [3, 0, 6, 4.85], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3, 7, 2],
            			"to": [0, 10, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 7, 6]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-2.5, 3, 11],
            			"to": [-0.5, 14.65, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-1.5, 9.875, 12]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 11.65], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 11.65], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 11.65], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 11.65], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-2.5, 7, 7],
            			"to": [-0.5, 18.6, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-1.5, 12.7, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 11.6], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 11.6], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 11.6], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 11.6], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-2.5, 10, 3],
            			"to": [-0.5, 22.6, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-1.5, 15, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12.6], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12.6], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 12.6], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12.6], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-2.5, 22.6, 3],
            			"to": [-0.5, 23.6, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-1.5, 23.1, 3.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-2.5, 18.6, 7],
            			"to": [-0.5, 19.6, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-1.5, 19.1, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-2.5, 14.6, 11],
            			"to": [-0.5, 15.6, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-1.5, 15.1, 11.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-3, 17.59099, -2.34099],
            			"to": [0, 18.59099, 20.15901],
            			"rotation": {"angle": 45, "axis": "x", "origin": [-1.5, 18.09099, 8.90901]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 1], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 1], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 16], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 16], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [4, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [4, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 1.5, -0.5],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		0,
            		1,
            		2,
            		{
            			"name": "rails",
            			"origin": [17.5, 15, 4],
            			"color": 0,
            			"children": [3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
            		}
            	]
            }
            """;

    public static String STAIRCASE_UPLEFT_RAILED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 7, 0],
            			"to": [16, 10, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 8],
            			"to": [16, 3, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 12]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, -8.8207, 12.6501],
            			"to": [8, 3.1793, 14.6501],
            			"rotation": {"angle": -45, "axis": "x", "origin": [5, -2.8207, 13.6501]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 12], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 12], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [2, -0.00591, 4.96031],
            			"to": [8, 9.74409, 6.96031],
            			"rotation": {"angle": -45, "axis": "x", "origin": [5, 4.86909, 5.96031]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 9.75], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 9.75], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 9.75], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 9.75], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-3, 0, 10],
            			"to": [0, 3, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 0, 14]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3, 3, 6],
            			"to": [0, 7, 10],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 4, 10]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3.001, 4.51872, 2.15628],
            			"to": [-0.001, 7.51872, 7.90628],
            			"rotation": {"angle": 45, "axis": "x", "origin": [-1.501, 6.01872, 5.03128]},
            			"faces": {
            				"north": {"uv": [3, 0, 0, 3], "texture": "#0"},
            				"east": {"uv": [5.75, 0, 0, 3], "texture": "#0"},
            				"south": {"uv": [3, 0, 0, 3], "texture": "#0"},
            				"west": {"uv": [5.75, 0, 0, 3], "texture": "#0"},
            				"up": {"uv": [3, 0, 0, 5.75], "texture": "#0"},
            				"down": {"uv": [3, 0, 0, 5.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3.001, 1.43943, 6.61339],
            			"to": [-0.001, 3.53943, 11.46339],
            			"rotation": {"angle": 45, "axis": "x", "origin": [-1.501, 2.48943, 9.03839]},
            			"faces": {
            				"north": {"uv": [3, 0, 6, 2.1], "texture": "#0"},
            				"east": {"uv": [5.75, 0, 10.6, 2.1], "texture": "#0"},
            				"south": {"uv": [3, 0, 6, 2.1], "texture": "#0"},
            				"west": {"uv": [5.75, 0, 10.6, 2.1], "texture": "#0"},
            				"up": {"uv": [3, 0, 6, 4.85], "texture": "#0"},
            				"down": {"uv": [3, 0, 6, 4.85], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3, 7, 2],
            			"to": [0, 10, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 7, 6]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-2.5, 3, 11],
            			"to": [-0.5, 14.65, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-1.5, 9.875, 12]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 11.65], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 11.65], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 11.65], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 11.65], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-2.5, 7, 7],
            			"to": [-0.5, 18.6, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-1.5, 12.7, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 11.6], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 11.6], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 11.6], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 11.6], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-2.5, 10, 3],
            			"to": [-0.5, 22.6, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-1.5, 15, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12.6], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12.6], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 12.6], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12.6], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-2.5, 22.6, 3],
            			"to": [-0.5, 23.6, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-1.5, 23.1, 3.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-2.5, 18.6, 7],
            			"to": [-0.5, 19.6, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-1.5, 19.1, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-2.5, 14.6, 11],
            			"to": [-0.5, 15.6, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-1.5, 15.1, 11.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-3, 17.59099, -2.34099],
            			"to": [0, 18.59099, 20.15901],
            			"rotation": {"angle": 45, "axis": "x", "origin": [-1.5, 18.09099, 8.90901]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 1], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 1], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 16], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 16], "texture": "#0"}
            			}
            		}
            	],
            	"groups": [
            		0,
            		1,
            		2,
            		3,
            		{
            			"name": "rails",
            			"origin": [17.5, 15, 4],
            			"color": 0,
            			"children": [4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
            		}
            	]
            }
            """;

    public static String STAIRCASE_RIGHT_RAILED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 7, 0],
            			"to": [16, 10, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 8],
            			"to": [16, 3, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 12]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [8, -0.00591, 4.96031],
            			"to": [14, 9.74409, 6.96031],
            			"rotation": {"angle": -45, "axis": "x", "origin": [11, 4.86909, 5.96031]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 9.75], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 9.75], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 9.75], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 9.75], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [16, 3, 6],
            			"to": [19, 7, 10],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17, 4, 10]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16, 0, 10],
            			"to": [19, 3, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17, 0, 14]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16, 7, 2],
            			"to": [19, 10, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17, 7, 6]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16.001, 4.51872, 2.15628],
            			"to": [19.001, 7.51872, 7.90628],
            			"rotation": {"angle": 45, "axis": "x", "origin": [17.501, 6.01872, 5.03128]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 5.75, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 5.75, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 5.75], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 5.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16.001, 1.43943, 6.61339],
            			"to": [19.001, 3.53943, 11.46339],
            			"rotation": {"angle": 45, "axis": "x", "origin": [17.501, 2.48943, 9.03839]},
            			"faces": {
            				"north": {"uv": [6, 0, 3, 2.1], "texture": "#0"},
            				"east": {"uv": [10.6, 0, 5.75, 2.1], "texture": "#0"},
            				"south": {"uv": [6, 0, 3, 2.1], "texture": "#0"},
            				"west": {"uv": [10.6, 0, 5.75, 2.1], "texture": "#0"},
            				"up": {"uv": [6, 0, 3, 4.85], "texture": "#0"},
            				"down": {"uv": [6, 0, 3, 4.85], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16.5, 22.6, 3],
            			"to": [18.5, 23.6, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17.5, 23.1, 3.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"east": {"uv": [1, 0, 0, 1], "texture": "#1"},
            				"south": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"west": {"uv": [1, 0, 0, 1], "texture": "#1"},
            				"up": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [16.5, 18.6, 7],
            			"to": [18.5, 19.6, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17.5, 19.1, 7.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"east": {"uv": [1, 0, 0, 1], "texture": "#1"},
            				"south": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"west": {"uv": [1, 0, 0, 1], "texture": "#1"},
            				"up": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [16.5, 14.6, 11],
            			"to": [18.5, 15.6, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17.5, 15.1, 11.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"east": {"uv": [1, 0, 0, 1], "texture": "#1"},
            				"south": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"west": {"uv": [1, 0, 0, 1], "texture": "#1"},
            				"up": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [16, 17.59099, -2.34099],
            			"to": [19, 18.59099, 20.15901],
            			"rotation": {"angle": 45, "axis": "x", "origin": [17.5, 18.09099, 8.90901]},
            			"faces": {
            				"north": {"uv": [3, 0, 0, 1], "texture": "#0"},
            				"east": {"uv": [16, 0, 0, 1], "texture": "#0"},
            				"south": {"uv": [3, 0, 0, 1], "texture": "#0"},
            				"west": {"uv": [16, 0, 0, 1], "texture": "#0"},
            				"up": {"uv": [3, 0, 0, 16], "texture": "#0"},
            				"down": {"uv": [3, 0, 0, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16.5, 3, 11],
            			"to": [18.5, 14.65, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17.5, 9.875, 12]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 11.65], "texture": "#1"},
            				"east": {"uv": [2, 0, 0, 11.65], "texture": "#1"},
            				"south": {"uv": [2, 0, 0, 11.65], "texture": "#1"},
            				"west": {"uv": [2, 0, 0, 11.65], "texture": "#1"},
            				"up": {"uv": [2, 0, 0, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [16.5, 7, 7],
            			"to": [18.5, 18.6, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17.5, 12.7, 8]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 11.6], "texture": "#1"},
            				"east": {"uv": [2, 0, 0, 11.6], "texture": "#1"},
            				"south": {"uv": [2, 0, 0, 11.6], "texture": "#1"},
            				"west": {"uv": [2, 0, 0, 11.6], "texture": "#1"},
            				"up": {"uv": [2, 0, 0, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [16.5, 10, 3],
            			"to": [18.5, 22.6, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17.5, 15, 4]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 12.6], "texture": "#1"},
            				"east": {"uv": [2, 0, 0, 12.6], "texture": "#1"},
            				"south": {"uv": [2, 0, 0, 12.6], "texture": "#1"},
            				"west": {"uv": [2, 0, 0, 12.6], "texture": "#1"},
            				"up": {"uv": [2, 0, 0, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [4, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [4, 3, -1.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 1.5, -0.5],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		0,
            		1,
            		2,
            		{
            			"name": "rails",
            			"origin": [17.5, 15, 4],
            			"color": 0,
            			"children": [3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
            		}
            	]
            }
            """;

    public static String STAIRCASE_UPRIGHT_RAILED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 7, 0],
            			"to": [16, 10, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 8],
            			"to": [16, 3, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 12]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [8, -8.8207, 12.6501],
            			"to": [14, 3.1793, 14.6501],
            			"rotation": {"angle": -45, "axis": "x", "origin": [11, -2.8207, 13.6501]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 12], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 12], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [8, -0.00591, 4.96031],
            			"to": [14, 9.74409, 6.96031],
            			"rotation": {"angle": -45, "axis": "x", "origin": [11, 4.86909, 5.96031]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 9.75], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 9.75], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 9.75], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 9.75], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [16, 3, 6],
            			"to": [19, 7, 10],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17, 4, 10]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16, 0, 10],
            			"to": [19, 3, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17, 0, 14]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16, 7, 2],
            			"to": [19, 10, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17, 7, 6]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16.001, 4.51872, 2.15628],
            			"to": [19.001, 7.51872, 7.90628],
            			"rotation": {"angle": 45, "axis": "x", "origin": [17.501, 6.01872, 5.03128]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 5.75, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 5.75, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 5.75], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 5.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16.001, 1.43943, 6.61339],
            			"to": [19.001, 3.53943, 11.46339],
            			"rotation": {"angle": 45, "axis": "x", "origin": [17.501, 2.48943, 9.03839]},
            			"faces": {
            				"north": {"uv": [6, 0, 3, 2.1], "texture": "#0"},
            				"east": {"uv": [10.6, 0, 5.75, 2.1], "texture": "#0"},
            				"south": {"uv": [6, 0, 3, 2.1], "texture": "#0"},
            				"west": {"uv": [10.6, 0, 5.75, 2.1], "texture": "#0"},
            				"up": {"uv": [6, 0, 3, 4.85], "texture": "#0"},
            				"down": {"uv": [6, 0, 3, 4.85], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16.5, 22.6, 3],
            			"to": [18.5, 23.6, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17.5, 23.1, 3.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"east": {"uv": [1, 0, 0, 1], "texture": "#1"},
            				"south": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"west": {"uv": [1, 0, 0, 1], "texture": "#1"},
            				"up": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [16.5, 18.6, 7],
            			"to": [18.5, 19.6, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17.5, 19.1, 7.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"east": {"uv": [1, 0, 0, 1], "texture": "#1"},
            				"south": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"west": {"uv": [1, 0, 0, 1], "texture": "#1"},
            				"up": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [16.5, 14.6, 11],
            			"to": [18.5, 15.6, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17.5, 15.1, 11.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"east": {"uv": [1, 0, 0, 1], "texture": "#1"},
            				"south": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"west": {"uv": [1, 0, 0, 1], "texture": "#1"},
            				"up": {"uv": [2, 0, 0, 1], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [16, 17.59099, -2.34099],
            			"to": [19, 18.59099, 20.15901],
            			"rotation": {"angle": 45, "axis": "x", "origin": [17.5, 18.09099, 8.90901]},
            			"faces": {
            				"north": {"uv": [3, 0, 0, 1], "texture": "#0"},
            				"east": {"uv": [16, 0, 0, 1], "texture": "#0"},
            				"south": {"uv": [3, 0, 0, 1], "texture": "#0"},
            				"west": {"uv": [16, 0, 0, 1], "texture": "#0"},
            				"up": {"uv": [3, 0, 0, 16], "texture": "#0"},
            				"down": {"uv": [3, 0, 0, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16.5, 3, 11],
            			"to": [18.5, 14.65, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17.5, 9.875, 12]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 11.65], "texture": "#1"},
            				"east": {"uv": [2, 0, 0, 11.65], "texture": "#1"},
            				"south": {"uv": [2, 0, 0, 11.65], "texture": "#1"},
            				"west": {"uv": [2, 0, 0, 11.65], "texture": "#1"},
            				"up": {"uv": [2, 0, 0, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [16.5, 7, 7],
            			"to": [18.5, 18.6, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17.5, 12.7, 8]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 11.6], "texture": "#1"},
            				"east": {"uv": [2, 0, 0, 11.6], "texture": "#1"},
            				"south": {"uv": [2, 0, 0, 11.6], "texture": "#1"},
            				"west": {"uv": [2, 0, 0, 11.6], "texture": "#1"},
            				"up": {"uv": [2, 0, 0, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [16.5, 10, 3],
            			"to": [18.5, 22.6, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [17.5, 15, 4]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 12.6], "texture": "#1"},
            				"east": {"uv": [2, 0, 0, 12.6], "texture": "#1"},
            				"south": {"uv": [2, 0, 0, 12.6], "texture": "#1"},
            				"west": {"uv": [2, 0, 0, 12.6], "texture": "#1"},
            				"up": {"uv": [2, 0, 0, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
            			}
            		}
            	],
            	"groups": [
            		0,
            		1,
            		2,
            		3,
            		{
            			"name": "rails",
            			"origin": [17.5, 15, 4],
            			"color": 0,
            			"children": [4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
            		}
            	]
            }
            """;

    public static String SMALL_STAIRCASE = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 2, 11],
            			"to": [16, 4, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 3, 13]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 7, 5.5],
            			"to": [16, 9, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 12, 0],
            			"to": [16, 14, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 13, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 6.43453, 2.86265],
            			"to": [7, 13.48453, 4.16265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [4, 9.95953, 3.51265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9, 6.43453, 2.86265],
            			"to": [15, 13.48453, 4.16265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [12, 9.95953, 3.51265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1.43453, 8.36265],
            			"to": [7, 8.48453, 9.66265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [4, 4.95953, 9.01265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9, 1.43453, 8.36265],
            			"to": [15, 8.48453, 9.66265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [12, 4.95953, 9.01265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9, 0.035, 13.11265],
            			"to": [15, 2.035, 14.41265],
            			"rotation": {"angle": 0, "axis": "x", "origin": [12, 1.035, 13.76265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 2], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0.035, 13.11265],
            			"to": [7, 2.035, 14.41265],
            			"rotation": {"angle": 0, "axis": "x", "origin": [4, 1.035, 13.76265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 2], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 1.25, -1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 1.25, -1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 1.25, -1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 1.25, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String SMALL_STAIRCASE_UP = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 2, 11],
            			"to": [16, 4, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 3, 13]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 7, 5.5],
            			"to": [16, 9, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 12, 0],
            			"to": [16, 14, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 13, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 6.43453, 2.86265],
            			"to": [7, 13.48453, 4.16265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [4, 9.95953, 3.51265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9, 6.43453, 2.86265],
            			"to": [15, 13.48453, 4.16265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [12, 9.95953, 3.51265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1.43453, 8.36265],
            			"to": [7, 8.48453, 9.66265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [4, 4.95953, 9.01265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9, 1.43453, 8.36265],
            			"to": [15, 8.48453, 9.66265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [12, 4.95953, 9.01265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9, -0.465, 13.11265],
            			"to": [15, 2.035, 14.41265],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12, 0.785, 13.76265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 2.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 2.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 2.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 2.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9.001, -3.37285, 14.32221],
            			"to": [15.001, 0.42715, 15.27221],
            			"rotation": {"angle": -45, "axis": "x", "origin": [12.001, -1.47285, 14.79721]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 3.8], "texture": "#1"},
            				"east": {"uv": [0, 0, 0.95, 3.8], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 3.8], "texture": "#1"},
            				"west": {"uv": [0, 0, 0.95, 3.8], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 0.95], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 0.95], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, -0.465, 13.11265],
            			"to": [7, 2.035, 14.41265],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 0.785, 13.76265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 2.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 2.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 2.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 2.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1.001, -3.37285, 14.32221],
            			"to": [7.001, 0.42715, 15.27221],
            			"rotation": {"angle": -45, "axis": "x", "origin": [4.001, -1.47285, 14.79721]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 3.8], "texture": "#1"},
            				"east": {"uv": [0, 0, 0.95, 3.8], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 3.8], "texture": "#1"},
            				"west": {"uv": [0, 0, 0.95, 3.8], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 0.95], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 0.95], "texture": "#1"}
            			}
            		}
            	]
            }
            """;

    public static String SMALL_STAIRCASE_CENTER = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 2, 11],
            			"to": [16, 4, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 3, 13]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 7, 5.5],
            			"to": [16, 9, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 12, 0],
            			"to": [16, 14, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 13, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [5, 6.43453, 2.86265],
            			"to": [11, 13.48453, 4.16265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [8, 9.95953, 3.51265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [5, 1.43453, 8.36265],
            			"to": [11, 8.48453, 9.66265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [8, 4.95953, 9.01265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [5, 0.035, 13.11265],
            			"to": [11, 2.035, 14.41265],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.035, 13.76265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 2], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		}
            	]
            }
            """;

    public static String SMALL_STAIRCASE_UPCENTER = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 2, 11],
            			"to": [16, 4, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 3, 13]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 7, 5.5],
            			"to": [16, 9, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 12, 0],
            			"to": [16, 14, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 13, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [5, 6.43453, 2.86265],
            			"to": [11, 13.48453, 4.16265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [8, 9.95953, 3.51265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [5, 1.43453, 8.36265],
            			"to": [11, 8.48453, 9.66265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [8, 4.95953, 9.01265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [5, -0.465, 13.11265],
            			"to": [11, 2.035, 14.41265],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.785, 13.76265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 2.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 2.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 2.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 2.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [5.001, -3.37285, 14.32221],
            			"to": [11.001, 0.42715, 15.27221],
            			"rotation": {"angle": -45, "axis": "x", "origin": [8.001, -1.47285, 14.79721]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 3.8], "texture": "#1"},
            				"east": {"uv": [0, 0, 0.95, 3.8], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 3.8], "texture": "#1"},
            				"west": {"uv": [0, 0, 0.95, 3.8], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 0.95], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 0.95], "texture": "#1"}
            			}
            		}
            	]
            }
            """;

    public static String SMALL_STAIRCASE_LEFT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 2, 11],
            			"to": [16, 4, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 3, 13]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 7, 5.5],
            			"to": [16, 9, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 12, 0],
            			"to": [16, 14, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 13, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 6.43453, 2.86265],
            			"to": [7, 13.48453, 4.16265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [4, 9.95953, 3.51265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1.43453, 8.36265],
            			"to": [7, 8.48453, 9.66265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [4, 4.95953, 9.01265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0.035, 13.11265],
            			"to": [7, 2.035, 14.41265],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 1.035, 13.76265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 2], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		}
            	]
            }
            """;

    public static String SMALL_STAIRCASE_UPLEFT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 2, 11],
            			"to": [16, 4, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 3, 13]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 7, 5.5],
            			"to": [16, 9, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 12, 0],
            			"to": [16, 14, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 13, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 6.43453, 2.86265],
            			"to": [7, 13.48453, 4.16265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [4, 9.95953, 3.51265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1.43453, 8.36265],
            			"to": [7, 8.48453, 9.66265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [4, 4.95953, 9.01265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, -0.465, 13.11265],
            			"to": [7, 2.035, 14.41265],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 0.785, 13.76265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 2.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 2.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 2.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 2.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1.001, -3.37285, 14.32221],
            			"to": [7.001, 0.42715, 15.27221],
            			"rotation": {"angle": -45, "axis": "x", "origin": [4.001, -1.47285, 14.79721]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 3.8], "texture": "#1"},
            				"east": {"uv": [0, 0, 0.95, 3.8], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 3.8], "texture": "#1"},
            				"west": {"uv": [0, 0, 0.95, 3.8], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 0.95], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 0.95], "texture": "#1"}
            			}
            		}
            	]
            }
            """;

    public static String SMALL_STAIRCASE_RIGHT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 2, 11],
            			"to": [16, 4, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 3, 13]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 7, 5.5],
            			"to": [16, 9, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 12, 0],
            			"to": [16, 14, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 13, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [9, 6.43453, 2.86265],
            			"to": [15, 13.48453, 4.16265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [12, 9.95953, 3.51265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9, 1.43453, 8.36265],
            			"to": [15, 8.48453, 9.66265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [12, 4.95953, 9.01265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9, 0.035, 13.11265],
            			"to": [15, 2.035, 14.41265],
            			"rotation": {"angle": 0, "axis": "x", "origin": [12, 1.035, 13.76265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 2], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		}
            	]
            }
            """;

    public static String SMALL_STAIRCASE_UPRIGHT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 2, 11],
            			"to": [16, 4, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 3, 13]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 7, 5.5],
            			"to": [16, 9, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 12, 0],
            			"to": [16, 14, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 13, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [9, 6.43453, 2.86265],
            			"to": [15, 13.48453, 4.16265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [12, 9.95953, 3.51265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9, 1.43453, 8.36265],
            			"to": [15, 8.48453, 9.66265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [12, 4.95953, 9.01265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9, -0.465, 13.11265],
            			"to": [15, 2.035, 14.41265],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12, 0.785, 13.76265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 2.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 2.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 2.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 2.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9.001, -3.37285, 14.32221],
            			"to": [15.001, 0.42715, 15.27221],
            			"rotation": {"angle": -45, "axis": "x", "origin": [12.001, -1.47285, 14.79721]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 3.8], "texture": "#1"},
            				"east": {"uv": [0, 0, 0.95, 3.8], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 3.8], "texture": "#1"},
            				"west": {"uv": [0, 0, 0.95, 3.8], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 0.95], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 0.95], "texture": "#1"}
            			}
            		}
            	]
            }
            """;

    public static String SMALL_STAIRCASE_LEFTCORNER = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [10.5, 2, 12],
            			"to": [14.5, 4, 17],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.25, 8, 8.75]},
            			"faces": {
            				"north": {"uv": [6, 7, 10, 9], "texture": "#0"},
            				"east": {"uv": [6, 7, 11, 9], "texture": "#0"},
            				"south": {"uv": [6, 7, 10, 9], "texture": "#0"},
            				"west": {"uv": [6, 7, 11, 9], "texture": "#0"},
            				"up": {"uv": [6, 7, 11, 11], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [6, 7, 11, 11], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [14.5, 2, 12],
            			"to": [15.5, 4, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.25, 8, 8.75]},
            			"faces": {
            				"north": {"uv": [7, 8, 8, 10], "texture": "#0"},
            				"east": {"uv": [7, 8, 11, 10], "texture": "#0"},
            				"south": {"uv": [7, 8, 8, 10], "texture": "#0"},
            				"west": {"uv": [7, 8, 11, 10], "texture": "#0"},
            				"up": {"uv": [7, 8, 11, 9], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [7, 8, 11, 9], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [5, 7, 6.5],
            			"to": [9, 9, 17],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.25, 8, 8.75]},
            			"faces": {
            				"north": {"uv": [3, 7, 7, 9], "texture": "#0"},
            				"east": {"uv": [3, 7, 13.5, 9], "texture": "#0"},
            				"south": {"uv": [3, 7, 7, 9], "texture": "#0"},
            				"west": {"uv": [3, 7, 13.5, 9], "texture": "#0"},
            				"up": {"uv": [3, 7, 13.5, 11], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [3, 7, 13.5, 11], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [9, 7, 6.5],
            			"to": [15.5, 9, 10.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.25, 8, 8.75]},
            			"faces": {
            				"north": {"uv": [7, 9, 13.5, 11], "texture": "#0"},
            				"east": {"uv": [7, 9, 11, 11], "texture": "#0"},
            				"south": {"uv": [7, 9, 13.5, 11], "texture": "#0"},
            				"west": {"uv": [7, 9, 11, 11], "texture": "#0"},
            				"up": {"uv": [7, 9, 13.5, 13], "texture": "#0"},
            				"down": {"uv": [7, 9, 13.5, 13], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-0.5, 12, 1],
            			"to": [3.5, 14, 17],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.25, 8, 8.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [3.5, 12, 1],
            			"to": [15.5, 14, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.25, 8, 8.75]},
            			"faces": {
            				"north": {"uv": [4, 4, 16, 6], "texture": "#0"},
            				"east": {"uv": [4, 4, 8, 6], "texture": "#0"},
            				"south": {"uv": [4, 4, 16, 6], "texture": "#0"},
            				"west": {"uv": [4, 4, 8, 6], "texture": "#0"},
            				"up": {"uv": [12, 4, 16, 16], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [12, 4, 16, 16], "rotation": 90, "texture": "#0"}
            			}
            		}
            	]
            }
            """;

    public static String SMALL_STAIRCASE_RIGHTCORNER = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 2, 11],
            			"to": [5, 4, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.5, 3, 13]},
            			"faces": {
            				"north": {"uv": [6, 7, 11, 9], "texture": "#0"},
            				"east": {"uv": [6, 7, 10, 9], "texture": "#0"},
            				"south": {"uv": [6, 7, 11, 9], "texture": "#0"},
            				"west": {"uv": [6, 7, 10, 9], "texture": "#0"},
            				"up": {"uv": [6, 7, 11, 11], "texture": "#0"},
            				"down": {"uv": [6, 7, 11, 11], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 2, 15],
            			"to": [5, 4, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 3, 15.5]},
            			"faces": {
            				"north": {"uv": [7, 8, 11, 10], "texture": "#0"},
            				"east": {"uv": [7, 8, 8, 10], "texture": "#0"},
            				"south": {"uv": [7, 8, 11, 10], "texture": "#0"},
            				"west": {"uv": [7, 8, 8, 10], "texture": "#0"},
            				"up": {"uv": [7, 8, 11, 9], "texture": "#0"},
            				"down": {"uv": [7, 8, 11, 9], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 7, 5.5],
            			"to": [10.5, 9, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [5.25, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [3, 7, 13.5, 9], "texture": "#0"},
            				"east": {"uv": [3, 7, 7, 9], "texture": "#0"},
            				"south": {"uv": [3, 7, 13.5, 9], "texture": "#0"},
            				"west": {"uv": [3, 7, 7, 9], "texture": "#0"},
            				"up": {"uv": [3, 7, 13.5, 11], "texture": "#0"},
            				"down": {"uv": [3, 7, 13.5, 11], "texture": "#0"}
            			}
            		},
            		{
            			"from": [6.5, 7, 9.5],
            			"to": [10.5, 9, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 8, 12.75]},
            			"faces": {
            				"north": {"uv": [7, 9, 11, 11], "texture": "#0"},
            				"east": {"uv": [7, 9, 13.5, 11], "texture": "#0"},
            				"south": {"uv": [7, 9, 11, 11], "texture": "#0"},
            				"west": {"uv": [7, 9, 13.5, 11], "texture": "#0"},
            				"up": {"uv": [7, 9, 13.5, 13], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [7, 9, 13.5, 13], "rotation": 270, "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 12, 0],
            			"to": [16, 14, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 13, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 12, 4],
            			"to": [16, 14, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14, 13, 6]},
            			"faces": {
            				"north": {"uv": [4, 4, 8, 6], "texture": "#0"},
            				"east": {"uv": [4, 4, 16, 6], "texture": "#0"},
            				"south": {"uv": [4, 4, 8, 6], "texture": "#0"},
            				"west": {"uv": [4, 4, 16, 6], "texture": "#0"},
            				"up": {"uv": [12, 4, 16, 16], "texture": "#0"},
            				"down": {"uv": [12, 4, 16, 16], "texture": "#0"}
            			}
            		}
            	]
            }
            """;

    public static String SMALL_STAIRCASE_RAILED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 2, 11],
            			"to": [16, 4, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 3, 13]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 7, 5.5],
            			"to": [16, 9, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 12, 0],
            			"to": [16, 14, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 13, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 6.43453, 2.86265],
            			"to": [7, 13.48453, 4.16265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [4, 9.95953, 3.51265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9, 6.43453, 2.86265],
            			"to": [15, 13.48453, 4.16265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [12, 9.95953, 3.51265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1.43453, 8.36265],
            			"to": [7, 8.48453, 9.66265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [4, 4.95953, 9.01265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9, 1.43453, 8.36265],
            			"to": [15, 8.48453, 9.66265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [12, 4.95953, 9.01265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9, 0.035, 13.11265],
            			"to": [15, 2.035, 14.41265],
            			"rotation": {"angle": 0, "axis": "x", "origin": [12, 1.035, 13.76265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 2], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0.035, 13.11265],
            			"to": [7, 2.035, 14.41265],
            			"rotation": {"angle": 0, "axis": "x", "origin": [4, 1.035, 13.76265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 2], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1, 0, 14],
            			"to": [1, 11.75, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 11.75], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 11.75], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 11.75], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 11.75], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1, 5, 8.5],
            			"to": [1, 17, 10.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1, 10, 3],
            			"to": [1, 22, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1, 7.5, 5.75],
            			"to": [1, 19.5, 7.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1, 12.5, 0.25],
            			"to": [1, 24.5, 2.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1, 2.5, 11.25],
            			"to": [1, 14.5, 13.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 12.5, 0.25],
            			"to": [17, 24.5, 2.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"up": {"uv": [2, 0, 4, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 4, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 10, 3],
            			"to": [17, 22, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"up": {"uv": [2, 0, 4, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 4, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 7.5, 5.75],
            			"to": [17, 19.5, 7.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"up": {"uv": [2, 0, 4, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 4, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 5, 8.5],
            			"to": [17, 17, 10.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"up": {"uv": [2, 0, 4, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 4, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 2.5, 11.25],
            			"to": [17, 14.5, 13.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"up": {"uv": [2, 0, 4, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 4, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 14],
            			"to": [17, 11.75, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 11.75], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 11.75], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 11.75], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 11.75], "texture": "#1"},
            				"up": {"uv": [2, 0, 4, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 4, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1.5, 15.33103, -6.57215],
            			"to": [1.5, 17.58103, 16.07785],
            			"rotation": {"angle": 45, "axis": "x", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 2.25], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 2.25], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 16], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [14.5, 15.33103, -6.57215],
            			"to": [17.5, 17.58103, 16.07785],
            			"rotation": {"angle": 45, "axis": "x", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [3, 0, 6, 2.25], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"south": {"uv": [3, 0, 6, 2.25], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"up": {"uv": [3, 0, 6, 16], "texture": "#0"},
            				"down": {"uv": [3, 0, 6, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-1.5, 5.98358, -4.11036],
            			"to": [1.5, 8.23358, 18.53964],
            			"rotation": {"angle": 45, "axis": "x", "origin": [8, 7.10858, 7.21464]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 2.25], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 2.25], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 16], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [14.5, 5.98358, -4.11036],
            			"to": [17.5, 8.23358, 18.53964],
            			"rotation": {"angle": 45, "axis": "x", "origin": [8, 7.10858, 7.21464]},
            			"faces": {
            				"north": {"uv": [3, 0, 6, 2.25], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"south": {"uv": [3, 0, 6, 2.25], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"up": {"uv": [3, 0, 6, 16], "texture": "#0"},
            				"down": {"uv": [3, 0, 6, 16], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 1.25, -1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 1.25, -1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 1.25, -1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 1.25, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		0,
            		1,
            		2,
            		3,
            		4,
            		5,
            		6,
            		7,
            		8,
            		{
            			"name": "rails",
            			"origin": [16, 6, 15],
            			"color": 0,
            			"children": [9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24]
            		}
            	]
            }
            """;

    public static String SMALL_STAIRCASE_UP_RAILED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 2, 11],
            			"to": [16, 4, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 3, 13]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 7, 5.5],
            			"to": [16, 9, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 12, 0],
            			"to": [16, 14, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 13, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 6.43453, 2.86265],
            			"to": [7, 13.48453, 4.16265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [4, 9.95953, 3.51265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9, 6.43453, 2.86265],
            			"to": [15, 13.48453, 4.16265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [12, 9.95953, 3.51265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1.43453, 8.36265],
            			"to": [7, 8.48453, 9.66265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [4, 4.95953, 9.01265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9, 1.43453, 8.36265],
            			"to": [15, 8.48453, 9.66265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [12, 4.95953, 9.01265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9, -0.465, 13.11265],
            			"to": [15, 2.035, 14.41265],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12, 0.785, 13.76265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 2.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 2.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 2.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 2.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9.001, -3.37285, 14.32221],
            			"to": [15.001, 0.42715, 15.27221],
            			"rotation": {"angle": -45, "axis": "x", "origin": [12.001, -1.47285, 14.79721]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 3.8], "texture": "#1"},
            				"east": {"uv": [0, 0, 0.95, 3.8], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 3.8], "texture": "#1"},
            				"west": {"uv": [0, 0, 0.95, 3.8], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 0.95], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 0.95], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, -0.465, 13.11265],
            			"to": [7, 2.035, 14.41265],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 0.785, 13.76265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 2.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 2.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 2.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 2.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1.001, -3.37285, 14.32221],
            			"to": [7.001, 0.42715, 15.27221],
            			"rotation": {"angle": -45, "axis": "x", "origin": [4.001, -1.47285, 14.79721]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 3.8], "texture": "#1"},
            				"east": {"uv": [0, 0, 0.95, 3.8], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 3.8], "texture": "#1"},
            				"west": {"uv": [0, 0, 0.95, 3.8], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 0.95], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 0.95], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1, 0, 14],
            			"to": [1, 11.75, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 11.75], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 11.75], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 11.75], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 11.75], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1, 5, 8.5],
            			"to": [1, 17, 10.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1, 10, 3],
            			"to": [1, 22, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1, 7.5, 5.75],
            			"to": [1, 19.5, 7.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1, 12.5, 0.25],
            			"to": [1, 24.5, 2.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1, 2.5, 11.25],
            			"to": [1, 14.5, 13.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 12.5, 0.25],
            			"to": [17, 24.5, 2.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"up": {"uv": [2, 0, 4, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 4, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 10, 3],
            			"to": [17, 22, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"up": {"uv": [2, 0, 4, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 4, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 7.5, 5.75],
            			"to": [17, 19.5, 7.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"up": {"uv": [2, 0, 4, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 4, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 5, 8.5],
            			"to": [17, 17, 10.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"up": {"uv": [2, 0, 4, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 4, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 2.5, 11.25],
            			"to": [17, 14.5, 13.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"up": {"uv": [2, 0, 4, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 4, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 14],
            			"to": [17, 11.75, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 11.75], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 11.75], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 11.75], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 11.75], "texture": "#1"},
            				"up": {"uv": [2, 0, 4, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 4, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1.5, 15.33103, -6.57215],
            			"to": [1.5, 17.58103, 16.07785],
            			"rotation": {"angle": 45, "axis": "x", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 2.25], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 2.25], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 16], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [14.5, 15.33103, -6.57215],
            			"to": [17.5, 17.58103, 16.07785],
            			"rotation": {"angle": 45, "axis": "x", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [3, 0, 6, 2.25], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"south": {"uv": [3, 0, 6, 2.25], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"up": {"uv": [3, 0, 6, 16], "texture": "#0"},
            				"down": {"uv": [3, 0, 6, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-1.5, 5.98358, -4.11036],
            			"to": [1.5, 8.23358, 18.53964],
            			"rotation": {"angle": 45, "axis": "x", "origin": [8, 7.10858, 7.21464]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 2.25], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 2.25], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 16], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [14.5, 5.98358, -4.11036],
            			"to": [17.5, 8.23358, 18.53964],
            			"rotation": {"angle": 45, "axis": "x", "origin": [8, 7.10858, 7.21464]},
            			"faces": {
            				"north": {"uv": [3, 0, 6, 2.25], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"south": {"uv": [3, 0, 6, 2.25], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"up": {"uv": [3, 0, 6, 16], "texture": "#0"},
            				"down": {"uv": [3, 0, 6, 16], "texture": "#0"}
            			}
            		}
            	],
            	"groups": [
            		0,
            		1,
            		2,
            		3,
            		4,
            		5,
            		6,
            		7,
            		8,
            		9,
            		10,
            		{
            			"name": "rails",
            			"origin": [16, 6, 15],
            			"color": 0,
            			"children": [11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26]
            		}
            	]
            }
            """;

    public static String SMALL_STAIRCASE_LEFT_RAILED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 2, 11],
            			"to": [16, 4, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 3, 13]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 7, 5.5],
            			"to": [16, 9, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 12, 0],
            			"to": [16, 14, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 13, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 6.43453, 2.86265],
            			"to": [7, 13.48453, 4.16265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [4, 9.95953, 3.51265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1.43453, 8.36265],
            			"to": [7, 8.48453, 9.66265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [4, 4.95953, 9.01265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0.035, 13.11265],
            			"to": [7, 2.035, 14.41265],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 1.035, 13.76265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 2], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1, 0, 14],
            			"to": [1, 11.75, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 11.75], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 11.75], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 11.75], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 11.75], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1, 5, 8.5],
            			"to": [1, 17, 10.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1, 10, 3],
            			"to": [1, 22, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1, 7.5, 5.75],
            			"to": [1, 19.5, 7.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1, 12.5, 0.25],
            			"to": [1, 24.5, 2.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1, 2.5, 11.25],
            			"to": [1, 14.5, 13.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1.5, 15.33103, -6.57215],
            			"to": [1.5, 17.58103, 16.07785],
            			"rotation": {"angle": 45, "axis": "x", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 2.25], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 2.25], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 16], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-1.5, 5.98358, -4.11036],
            			"to": [1.5, 8.23358, 18.53964],
            			"rotation": {"angle": 45, "axis": "x", "origin": [0, 7.10858, 7.21464]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 2.25], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 2.25], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 16], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 16], "texture": "#0"}
            			}
            		}
            	],
            	"groups": [
            		0,
            		1,
            		2,
            		3,
            		4,
            		5,
            		{
            			"name": "rails",
            			"origin": [16, 6, 15],
            			"color": 0,
            			"children": [6, 7, 8, 9, 10, 11, 12, 13]
            		}
            	]
            }
            """;

    public static String SMALL_STAIRCASE_UPLEFT_RAILED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 2, 11],
            			"to": [16, 4, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 3, 13]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 7, 5.5],
            			"to": [16, 9, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 12, 0],
            			"to": [16, 14, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 13, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 6.43453, 2.86265],
            			"to": [7, 13.48453, 4.16265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [4, 9.95953, 3.51265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1.43453, 8.36265],
            			"to": [7, 8.48453, 9.66265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [4, 4.95953, 9.01265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, -0.465, 13.11265],
            			"to": [7, 2.035, 14.41265],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 0.785, 13.76265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 2.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 2.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 2.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 2.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1.001, -3.37285, 14.32221],
            			"to": [7.001, 0.42715, 15.27221],
            			"rotation": {"angle": -45, "axis": "x", "origin": [4.001, -1.47285, 14.79721]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 3.8], "texture": "#1"},
            				"east": {"uv": [0, 0, 0.95, 3.8], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 3.8], "texture": "#1"},
            				"west": {"uv": [0, 0, 0.95, 3.8], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 0.95], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 0.95], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1, 0, 14],
            			"to": [1, 11.75, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 11.75], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 11.75], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 11.75], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 11.75], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1, 5, 8.5],
            			"to": [1, 17, 10.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1, 10, 3],
            			"to": [1, 22, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1, 7.5, 5.75],
            			"to": [1, 19.5, 7.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1, 12.5, 0.25],
            			"to": [1, 24.5, 2.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1, 2.5, 11.25],
            			"to": [1, 14.5, 13.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1.5, 15.33103, -6.57215],
            			"to": [1.5, 17.58103, 16.07785],
            			"rotation": {"angle": 45, "axis": "x", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 2.25], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 2.25], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 16], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-1.5, 5.98358, -4.11036],
            			"to": [1.5, 8.23358, 18.53964],
            			"rotation": {"angle": 45, "axis": "x", "origin": [0, 7.10858, 7.21464]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 2.25], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 2.25], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 16], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 16], "texture": "#0"}
            			}
            		}
            	],
            	"groups": [
            		0,
            		1,
            		2,
            		3,
            		4,
            		5,
            		6,
            		{
            			"name": "rails",
            			"origin": [16, 6, 15],
            			"color": 0,
            			"children": [7, 8, 9, 10, 11, 12, 13, 14]
            		}
            	]
            }
            """;

    public static String SMALL_STAIRCASE_RIGHT_RAILED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 2, 11],
            			"to": [16, 4, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 3, 13]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 7, 5.5],
            			"to": [16, 9, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 12, 0],
            			"to": [16, 14, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 13, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [9, 6.43453, 2.86265],
            			"to": [15, 13.48453, 4.16265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [12, 9.95953, 3.51265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9, 1.43453, 8.36265],
            			"to": [15, 8.48453, 9.66265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [12, 4.95953, 9.01265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9, 0.035, 13.11265],
            			"to": [15, 2.035, 14.41265],
            			"rotation": {"angle": 0, "axis": "x", "origin": [12, 1.035, 13.76265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 2], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 12.5, 0.25],
            			"to": [17, 24.5, 2.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"up": {"uv": [2, 0, 4, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 4, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 10, 3],
            			"to": [17, 22, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"up": {"uv": [2, 0, 4, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 4, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 7.5, 5.75],
            			"to": [17, 19.5, 7.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"up": {"uv": [2, 0, 4, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 4, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 5, 8.5],
            			"to": [17, 17, 10.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"up": {"uv": [2, 0, 4, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 4, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 2.5, 11.25],
            			"to": [17, 14.5, 13.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"up": {"uv": [2, 0, 4, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 4, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 14],
            			"to": [17, 11.75, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 11.75], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 11.75], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 11.75], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 11.75], "texture": "#1"},
            				"up": {"uv": [2, 0, 4, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 4, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14.5, 15.33103, -6.57215],
            			"to": [17.5, 17.58103, 16.07785],
            			"rotation": {"angle": 45, "axis": "x", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [3, 0, 6, 2.25], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"south": {"uv": [3, 0, 6, 2.25], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"up": {"uv": [3, 0, 6, 16], "texture": "#0"},
            				"down": {"uv": [3, 0, 6, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [14.5, 5.98358, -4.11036],
            			"to": [17.5, 8.23358, 18.53964],
            			"rotation": {"angle": 45, "axis": "x", "origin": [16, 7.10858, 7.21464]},
            			"faces": {
            				"north": {"uv": [3, 0, 6, 2.25], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"south": {"uv": [3, 0, 6, 2.25], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"up": {"uv": [3, 0, 6, 16], "texture": "#0"},
            				"down": {"uv": [3, 0, 6, 16], "texture": "#0"}
            			}
            		}
            	],
            	"groups": [
            		0,
            		1,
            		2,
            		3,
            		4,
            		5,
            		{
            			"name": "rails",
            			"origin": [16, 6, 15],
            			"color": 0,
            			"children": [6, 7, 8, 9, 10, 11, 12, 13]
            		}
            	]
            }
            """;

    public static String SMALL_STAIRCASE_UPRIGHT_RAILED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 2, 11],
            			"to": [16, 4, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 3, 13]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 7, 5.5],
            			"to": [16, 9, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 12, 0],
            			"to": [16, 14, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 13, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [9, 6.43453, 2.86265],
            			"to": [15, 13.48453, 4.16265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [12, 9.95953, 3.51265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9, 1.43453, 8.36265],
            			"to": [15, 8.48453, 9.66265],
            			"rotation": {"angle": -45, "axis": "x", "origin": [12, 4.95953, 9.01265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 7.05], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 7.05], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9, -0.465, 13.11265],
            			"to": [15, 2.035, 14.41265],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12, 0.785, 13.76265]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 2.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.3, 2.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 2.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.3, 2.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1.3], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1.3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9.001, -3.37285, 14.32221],
            			"to": [15.001, 0.42715, 15.27221],
            			"rotation": {"angle": -45, "axis": "x", "origin": [12.001, -1.47285, 14.79721]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 3.8], "texture": "#1"},
            				"east": {"uv": [0, 0, 0.95, 3.8], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 3.8], "texture": "#1"},
            				"west": {"uv": [0, 0, 0.95, 3.8], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 0.95], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 0.95], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 12.5, 0.25],
            			"to": [17, 24.5, 2.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"up": {"uv": [2, 0, 4, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 4, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 10, 3],
            			"to": [17, 22, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"up": {"uv": [2, 0, 4, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 4, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 7.5, 5.75],
            			"to": [17, 19.5, 7.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"up": {"uv": [2, 0, 4, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 4, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 5, 8.5],
            			"to": [17, 17, 10.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"up": {"uv": [2, 0, 4, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 4, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 2.5, 11.25],
            			"to": [17, 14.5, 13.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 12], "texture": "#1"},
            				"up": {"uv": [2, 0, 4, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 4, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 14],
            			"to": [17, 11.75, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 11.75], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 11.75], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 11.75], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 11.75], "texture": "#1"},
            				"up": {"uv": [2, 0, 4, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 4, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14.5, 15.33103, -6.57215],
            			"to": [17.5, 17.58103, 16.07785],
            			"rotation": {"angle": 45, "axis": "x", "origin": [8, 12.25, 8.125]},
            			"faces": {
            				"north": {"uv": [3, 0, 6, 2.25], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"south": {"uv": [3, 0, 6, 2.25], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"up": {"uv": [3, 0, 6, 16], "texture": "#0"},
            				"down": {"uv": [3, 0, 6, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [14.5, 5.98358, -4.11036],
            			"to": [17.5, 8.23358, 18.53964],
            			"rotation": {"angle": 45, "axis": "x", "origin": [16, 7.10858, 7.21464]},
            			"faces": {
            				"north": {"uv": [3, 0, 6, 2.25], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"south": {"uv": [3, 0, 6, 2.25], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 2.25], "texture": "#0"},
            				"up": {"uv": [3, 0, 6, 16], "texture": "#0"},
            				"down": {"uv": [3, 0, 6, 16], "texture": "#0"}
            			}
            		}
            	],
            	"groups": [
            		0,
            		1,
            		2,
            		3,
            		4,
            		5,
            		6,
            		{
            			"name": "rails",
            			"origin": [16, 6, 15],
            			"color": 0,
            			"children": [7, 8, 9, 10, 11, 12, 13, 14]
            		}
            	]
            }
            """;

    public static String STAIRAIL = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [7, 0, 0],
            			"to": [9, 15.6, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12.6], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 12.6], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 12.6], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 12.6], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [6.5, 15, -0.5],
            			"to": [9.5, 16, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 1], "texture": "#0"},
            				"east": {"uv": [0, 0, 3, 1], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 1], "texture": "#0"},
            				"west": {"uv": [0, 0, 3, 1], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#0"}
            			}
            		}
            	]
            }
            """;

    public static String STAIRAIL_SIDE = """
            {
             	"credit": "Made with Blockbench",
             	"textures": {
             		"0": "BASE_NAME",
             		"1": "LEG_NAME",
             		"particle": "BASE_NAME"
             	},
             	"elements": [
             		{
             			"from": [1, 0, 0],
             			"to": [3, 15.6, 2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [2, 7.8, 1]},
             			"faces": {
             				"north": {"uv": [1, 0, 3, 12.6], "texture": "#1"},
             				"east": {"uv": [1, 0, 3, 12.6], "texture": "#1"},
             				"south": {"uv": [1, 0, 3, 12.6], "texture": "#1"},
             				"west": {"uv": [1, 0, 3, 12.6], "texture": "#1"},
             				"up": {"uv": [1, 0, 3, 2], "texture": "#1"},
             				"down": {"uv": [1, 0, 3, 2], "texture": "#1"}
             			}
             		},
             		{
             			"from": [5, 0, 0],
             			"to": [7, 15.6, 2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [6, 7.8, 1]},
             			"faces": {
             				"north": {"uv": [4, 0, 6, 12.6], "texture": "#1"},
             				"east": {"uv": [4, 0, 6, 12.6], "texture": "#1"},
             				"south": {"uv": [4, 0, 6, 12.6], "texture": "#1"},
             				"west": {"uv": [4, 0, 6, 12.6], "texture": "#1"},
             				"up": {"uv": [4, 0, 6, 2], "texture": "#1"},
             				"down": {"uv": [4, 0, 6, 2], "texture": "#1"}
             			}
             		},
             		{
             			"from": [9, 0, 0],
             			"to": [11, 15.6, 2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [10, 7.8, 1]},
             			"faces": {
             				"north": {"uv": [6, 0, 8, 12.6], "texture": "#1"},
             				"east": {"uv": [6, 0, 8, 12.6], "texture": "#1"},
             				"south": {"uv": [6, 0, 8, 12.6], "texture": "#1"},
             				"west": {"uv": [6, 0, 8, 12.6], "texture": "#1"},
             				"up": {"uv": [6, 0, 8, 2], "texture": "#1"},
             				"down": {"uv": [6, 0, 8, 2], "texture": "#1"}
             			}
             		},
             		{
             			"from": [13, 0, 0],
             			"to": [15, 15.6, 2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14, 7.8, 1]},
             			"faces": {
             				"north": {"uv": [9, 0, 11, 12.6], "texture": "#1"},
             				"east": {"uv": [9, 0, 11, 12.6], "texture": "#1"},
             				"south": {"uv": [9, 0, 11, 12.6], "texture": "#1"},
             				"west": {"uv": [9, 0, 11, 12.6], "texture": "#1"},
             				"up": {"uv": [9, 0, 11, 2], "texture": "#1"},
             				"down": {"uv": [9, 0, 11, 2], "texture": "#1"}
             			}
             		},
             		{
             			"from": [0, 15, -0.5],
             			"to": [16, 16, 2.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 1]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 3, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 3, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [1, 1, 1],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [1, 1, 1],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [1, 1, 1],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [1, 1, 1],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 2.25, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"translation": [0, 0, 0.5],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	}
            }
            """;

    public static String STAIRAIL_LEFTCORNER = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "LEG_NAME",
            		"1": "BASE_NAME",
            		"particle": "LEG_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 6],
            			"to": [2, 15.6, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 11.65, 4]},
            			"faces": {
            				"north": {"uv": [12, 0, 14, 12.6], "texture": "#0"},
            				"east": {"uv": [12, 0, 14, 12.6], "texture": "#0"},
            				"south": {"uv": [12, 0, 14, 12.6], "texture": "#0"},
            				"west": {"uv": [12, 0, 14, 12.6], "texture": "#0"},
            				"up": {"uv": [12, 0, 14, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [12, 0, 14, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 2],
            			"to": [2, 15.6, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 11.65, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12.6], "texture": "#0"},
            				"east": {"uv": [0, 0, 2, 12.6], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 12.6], "texture": "#0"},
            				"west": {"uv": [0, 0, 2, 12.6], "texture": "#0"},
            				"up": {"uv": [0, 0, 2, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [0, 0, 2, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 14],
            			"to": [2, 15.6, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 11.65, 12]},
            			"faces": {
            				"north": {"uv": [12, 0, 14, 12.6], "texture": "#0"},
            				"east": {"uv": [12, 0, 14, 12.6], "texture": "#0"},
            				"south": {"uv": [12, 0, 14, 12.6], "texture": "#0"},
            				"west": {"uv": [12, 0, 14, 12.6], "texture": "#0"},
            				"up": {"uv": [12, 0, 14, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [12, 0, 14, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 10],
            			"to": [2, 15.6, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 11.65, 12]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12.6], "texture": "#0"},
            				"east": {"uv": [0, 0, 2, 12.6], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 12.6], "texture": "#0"},
            				"west": {"uv": [0, 0, 2, 12.6], "texture": "#0"},
            				"up": {"uv": [0, 0, 2, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [0, 0, 2, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [6, 0, 0],
            			"to": [8, 15.6, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 11.65, 4]},
            			"faces": {
            				"north": {"uv": [8, 0, 10, 12.6], "texture": "#0"},
            				"east": {"uv": [8, 0, 10, 12.6], "texture": "#0"},
            				"south": {"uv": [8, 0, 10, 12.6], "texture": "#0"},
            				"west": {"uv": [8, 0, 10, 12.6], "texture": "#0"},
            				"up": {"uv": [8, 0, 10, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [8, 0, 10, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 0, 0],
            			"to": [4, 15.6, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 11.65, 4]},
            			"faces": {
            				"north": {"uv": [6, 0, 8, 12.6], "texture": "#0"},
            				"east": {"uv": [6, 0, 8, 12.6], "texture": "#0"},
            				"south": {"uv": [6, 0, 8, 12.6], "texture": "#0"},
            				"west": {"uv": [6, 0, 8, 12.6], "texture": "#0"},
            				"up": {"uv": [6, 0, 8, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [6, 0, 8, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [10, 0, 0],
            			"to": [12, 15.6, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12, 11.65, 4]},
            			"faces": {
            				"north": {"uv": [6, 0, 8, 12.6], "texture": "#0"},
            				"east": {"uv": [6, 0, 8, 12.6], "texture": "#0"},
            				"south": {"uv": [6, 0, 8, 12.6], "texture": "#0"},
            				"west": {"uv": [6, 0, 8, 12.6], "texture": "#0"},
            				"up": {"uv": [6, 0, 8, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [6, 0, 8, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [14, 0, 0],
            			"to": [16, 15.6, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12, 11.65, 4]},
            			"faces": {
            				"north": {"uv": [8, 0, 10, 12.6], "texture": "#0"},
            				"east": {"uv": [8, 0, 10, 12.6], "texture": "#0"},
            				"south": {"uv": [8, 0, 10, 12.6], "texture": "#0"},
            				"west": {"uv": [8, 0, 10, 12.6], "texture": "#0"},
            				"up": {"uv": [8, 0, 10, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [8, 0, 10, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 0],
            			"to": [2, 15.6, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 11.65, 4]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 12.6], "texture": "#0"},
            				"east": {"uv": [2, 0, 4, 12.6], "texture": "#0"},
            				"south": {"uv": [2, 0, 4, 12.6], "texture": "#0"},
            				"west": {"uv": [2, 0, 4, 12.6], "texture": "#0"},
            				"up": {"uv": [2, 0, 4, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [2, 0, 4, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [-0.5, 15, -0.5],
            			"to": [2.5, 16, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 11.65, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"east": {"uv": [0, 0, 9.5, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"west": {"uv": [0, 0, 9.5, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 9.5, 3], "rotation": 270, "texture": "#1"},
            				"down": {"uv": [0, 0, 9.5, 3], "rotation": 90, "texture": "#1"}
            			}
            		},
            		{
            			"from": [-0.5, 15, 9],
            			"to": [2.5, 16, 16.001],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 11.65, 13.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 7, 3], "rotation": 270, "texture": "#1"},
            				"down": {"uv": [0, 0, 7, 3], "rotation": 90, "texture": "#1"}
            			}
            		},
            		{
            			"from": [2.5, 15, -0.5],
            			"to": [9, 16, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 11.65, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 6.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 3, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 6.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 3, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 3, 6.5], "rotation": 270, "texture": "#1"},
            				"down": {"uv": [0, 0, 3, 6.5], "rotation": 90, "texture": "#1"}
            			}
            		},
            		{
            			"from": [9, 15, -0.5],
            			"to": [16.001, 16, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [11, 11.65, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"east": {"uv": [0, 0, 3, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"west": {"uv": [0, 0, 3, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 3, 7], "rotation": 270, "texture": "#1"},
            				"down": {"uv": [0, 0, 3, 7], "rotation": 90, "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 1, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 1, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 1, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 1, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2.25, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 0.5],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String STAIRAIL_RIGHTCORNER = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [8, 0, 0],
            			"to": [10, 15.6, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [9, 7.8, 1]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 12.6], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 12.6], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 12.6], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 12.6], "texture": "#1"},
            				"up": {"uv": [2, 0, 4, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 4, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [12, 0, 0],
            			"to": [14, 15.6, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 7.8, 1]},
            			"faces": {
            				"north": {"uv": [1, 0, 3, 12.6], "texture": "#1"},
            				"east": {"uv": [1, 0, 3, 12.6], "texture": "#1"},
            				"south": {"uv": [1, 0, 3, 12.6], "texture": "#1"},
            				"west": {"uv": [1, 0, 3, 12.6], "texture": "#1"},
            				"up": {"uv": [1, 0, 3, 2], "texture": "#1"},
            				"down": {"uv": [1, 0, 3, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 0, 0],
            			"to": [2, 15.6, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 7.8, 1]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 12.6], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 12.6], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 12.6], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 12.6], "texture": "#1"},
            				"up": {"uv": [2, 0, 4, 2], "texture": "#1"},
            				"down": {"uv": [2, 0, 4, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [4, 0, 0],
            			"to": [6, 15.6, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [5, 7.8, 1]},
            			"faces": {
            				"north": {"uv": [1, 0, 3, 12.6], "texture": "#1"},
            				"east": {"uv": [1, 0, 3, 12.6], "texture": "#1"},
            				"south": {"uv": [1, 0, 3, 12.6], "texture": "#1"},
            				"west": {"uv": [1, 0, 3, 12.6], "texture": "#1"},
            				"up": {"uv": [1, 0, 3, 2], "texture": "#1"},
            				"down": {"uv": [1, 0, 3, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14, 0, 6],
            			"to": [16, 15.6, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15, 7.8, 7]},
            			"faces": {
            				"north": {"uv": [10, 0, 12, 12.6], "texture": "#1"},
            				"east": {"uv": [10, 0, 12, 12.6], "texture": "#1"},
            				"south": {"uv": [10, 0, 12, 12.6], "texture": "#1"},
            				"west": {"uv": [10, 0, 12, 12.6], "texture": "#1"},
            				"up": {"uv": [10, 0, 12, 2], "texture": "#1"},
            				"down": {"uv": [10, 0, 12, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14, 0, 2],
            			"to": [16, 15.6, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15, 7.8, 3]},
            			"faces": {
            				"north": {"uv": [12, 0, 14, 12.6], "texture": "#1"},
            				"east": {"uv": [12, 0, 14, 12.6], "texture": "#1"},
            				"south": {"uv": [12, 0, 14, 12.6], "texture": "#1"},
            				"west": {"uv": [12, 0, 14, 12.6], "texture": "#1"},
            				"up": {"uv": [12, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [12, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14, 0, 14],
            			"to": [16, 15.6, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15, 7.8, 15]},
            			"faces": {
            				"north": {"uv": [10, 0, 12, 12.6], "texture": "#1"},
            				"east": {"uv": [10, 0, 12, 12.6], "texture": "#1"},
            				"south": {"uv": [10, 0, 12, 12.6], "texture": "#1"},
            				"west": {"uv": [10, 0, 12, 12.6], "texture": "#1"},
            				"up": {"uv": [10, 0, 12, 2], "texture": "#1"},
            				"down": {"uv": [10, 0, 12, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14, 0, 10],
            			"to": [16, 15.6, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15, 7.8, 11]},
            			"faces": {
            				"north": {"uv": [12, 0, 14, 12.6], "texture": "#1"},
            				"east": {"uv": [12, 0, 14, 12.6], "texture": "#1"},
            				"south": {"uv": [12, 0, 14, 12.6], "texture": "#1"},
            				"west": {"uv": [12, 0, 14, 12.6], "texture": "#1"},
            				"up": {"uv": [12, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [12, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14, 0, 0],
            			"to": [16, 15.6, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15, 7.8, 1]},
            			"faces": {
            				"north": {"uv": [4, 0, 6, 12.6], "texture": "#1"},
            				"east": {"uv": [4, 0, 6, 12.6], "texture": "#1"},
            				"south": {"uv": [4, 0, 6, 12.6], "texture": "#1"},
            				"west": {"uv": [4, 0, 6, 12.6], "texture": "#1"},
            				"up": {"uv": [4, 0, 6, 2], "texture": "#1"},
            				"down": {"uv": [4, 0, 6, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [7, 15, -0.5],
            			"to": [16.5, 16, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [11.75, 15.5, 1]},
            			"faces": {
            				"north": {"uv": [3, 0, 12.5, 1], "texture": "#0"},
            				"east": {"uv": [3, 0, 6, 1], "texture": "#0"},
            				"south": {"uv": [3, 0, 12.5, 1], "texture": "#0"},
            				"west": {"uv": [3, 0, 6, 1], "texture": "#0"},
            				"up": {"uv": [3, 0, 12.5, 3], "texture": "#0"},
            				"down": {"uv": [3, 0, 12.5, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-0.001, 15, -0.5],
            			"to": [7, 16, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.15, 15.5, 1]},
            			"faces": {
            				"north": {"uv": [3, 0, 10, 1], "texture": "#0"},
            				"east": {"uv": [3, 0, 6, 1], "texture": "#0"},
            				"south": {"uv": [3, 0, 10, 1], "texture": "#0"},
            				"west": {"uv": [3, 0, 6, 1], "texture": "#0"},
            				"up": {"uv": [3, 0, 10, 3], "texture": "#0"},
            				"down": {"uv": [3, 0, 10, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.5, 15, 2.5],
            			"to": [16.5, 16, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15, 15.5, 5.75]},
            			"faces": {
            				"north": {"uv": [11, 0, 14, 1], "texture": "#0"},
            				"east": {"uv": [11, 0, 12, 6.5], "texture": "#0"},
            				"south": {"uv": [11, 0, 14, 1], "texture": "#0"},
            				"west": {"uv": [11, 0, 12, 6.5], "texture": "#0"},
            				"up": {"uv": [11, 0, 14, 6.5], "texture": "#0"},
            				"down": {"uv": [11, 0, 14, 6.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.5, 15, 9],
            			"to": [16.5, 16, 16.001],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15, 15.5, 12.25]},
            			"faces": {
            				"north": {"uv": [11, 0, 14, 1], "texture": "#0"},
            				"east": {"uv": [11, 0, 12, 8.5], "texture": "#0"},
            				"south": {"uv": [11, 0, 14, 1], "texture": "#0"},
            				"west": {"uv": [11, 0, 12, 8.5], "texture": "#0"},
            				"up": {"uv": [11, 0, 14, 8.5], "texture": "#0"},
            				"down": {"uv": [11, 0, 14, 8.5], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 1, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 1, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 1, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 1, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2.25, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 0.5],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String SMALL_STAIRAIL = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "LEG_NAME",
            		"1": "BASE_NAME",
            		"particle": "LEG_NAME"
            	},
            	"elements": [
            		{
            			"from": [7, 0, 0],
            			"to": [9, 12, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 6, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 12], "texture": "#0"},
            				"east": {"uv": [0, 0, 2, 12], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 12], "texture": "#0"},
            				"west": {"uv": [0, 0, 2, 12], "texture": "#0"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#0"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [6.5, 12, -0.5],
            			"to": [9.5, 14.25, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 13.125, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 2.25], "texture": "#1"},
            				"east": {"uv": [0, 0, 3, 2.25], "texture": "#1"},
            				"south": {"uv": [0, 0, 3, 2.25], "texture": "#1"},
            				"west": {"uv": [0, 0, 3, 2.25], "texture": "#1"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#1"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#1"}
            			}
            		}
            	]
            }
            """;

    public static String SMALL_STAIRAIL_SIDE = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [5.6, 0, 0],
            			"to": [7.6, 12, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [6.6, 6, 1]},
            			"faces": {
            				"north": {"uv": [9, 0, 11, 12], "texture": "#1"},
            				"east": {"uv": [9, 0, 11, 12], "texture": "#1"},
            				"south": {"uv": [9, 0, 11, 12], "texture": "#1"},
            				"west": {"uv": [9, 0, 11, 12], "texture": "#1"},
            				"up": {"uv": [9, 0, 11, 2], "texture": "#1"},
            				"down": {"uv": [9, 0, 11, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [8.25, 0, 0],
            			"to": [10.25, 12, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [9.25, 6, 1]},
            			"faces": {
            				"north": {"uv": [12, 0, 14, 12], "texture": "#1"},
            				"east": {"uv": [12, 0, 14, 12], "texture": "#1"},
            				"south": {"uv": [12, 0, 14, 12], "texture": "#1"},
            				"west": {"uv": [12, 0, 14, 12], "texture": "#1"},
            				"up": {"uv": [12, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [12, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [2.95, 0, 0],
            			"to": [4.95, 12, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.95, 6, 1]},
            			"faces": {
            				"north": {"uv": [4, 0, 6, 12], "texture": "#1"},
            				"east": {"uv": [4, 0, 6, 12], "texture": "#1"},
            				"south": {"uv": [4, 0, 6, 12], "texture": "#1"},
            				"west": {"uv": [4, 0, 6, 12], "texture": "#1"},
            				"up": {"uv": [4, 0, 6, 2], "texture": "#1"},
            				"down": {"uv": [4, 0, 6, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0.3, 0, 0],
            			"to": [2.3, 12, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.3, 6, 1]},
            			"faces": {
            				"north": {"uv": [1, 0, 3, 12], "texture": "#1"},
            				"east": {"uv": [1, 0, 3, 12], "texture": "#1"},
            				"south": {"uv": [1, 0, 3, 12], "texture": "#1"},
            				"west": {"uv": [1, 0, 3, 12], "texture": "#1"},
            				"up": {"uv": [1, 0, 3, 2], "texture": "#1"},
            				"down": {"uv": [1, 0, 3, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [10.9, 0, 0],
            			"to": [12.9, 12, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [11.9, 6, 1]},
            			"faces": {
            				"north": {"uv": [4, 0, 6, 12], "texture": "#1"},
            				"east": {"uv": [4, 0, 6, 12], "texture": "#1"},
            				"south": {"uv": [4, 0, 6, 12], "texture": "#1"},
            				"west": {"uv": [4, 0, 6, 12], "texture": "#1"},
            				"up": {"uv": [4, 0, 6, 2], "texture": "#1"},
            				"down": {"uv": [4, 0, 6, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [13.55, 0, 0],
            			"to": [15.55, 12, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.55, 6, 1]},
            			"faces": {
            				"north": {"uv": [10, 0, 12, 12], "texture": "#1"},
            				"east": {"uv": [10, 0, 12, 12], "texture": "#1"},
            				"south": {"uv": [10, 0, 12, 12], "texture": "#1"},
            				"west": {"uv": [10, 0, 12, 12], "texture": "#1"},
            				"up": {"uv": [10, 0, 12, 2], "texture": "#1"},
            				"down": {"uv": [10, 0, 12, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 12, -0.5],
            			"to": [16, 14.25, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 13.125, 1]},
            			"faces": {
            				"north": {"uv": [0, 8, 16, 10.25], "texture": "#0"},
            				"east": {"uv": [0, 8, 3, 10.25], "texture": "#0"},
            				"south": {"uv": [0, 8, 16, 10.25], "texture": "#0"},
            				"west": {"uv": [0, 8, 3, 10.25], "texture": "#0"},
            				"up": {"uv": [0, 8, 16, 11], "texture": "#0"},
            				"down": {"uv": [0, 8, 16, 11], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 1, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 1, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 1, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 1, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String SMALL_STAIRAIL_LEFTCORNER = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "LEG_NAME",
            		"1": "BASE_NAME",
            		"particle": "LEG_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 2.4],
             			"to": [2, 12, 4.4],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1, 6, 3.4]},
             			"faces": {
             				"north": {"uv": [13, 0, 15, 12], "texture": "#0"},
             				"east": {"uv": [13, 0, 15, 12], "texture": "#0"},
             				"south": {"uv": [13, 0, 15, 12], "texture": "#0"},
             				"west": {"uv": [13, 0, 15, 12], "texture": "#0"},
             				"up": {"uv": [13, 0, 15, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [13, 0, 15, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [2.351, 0, 0],
             			"to": [4.351, 12, 2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [6, 9.5625, 1]},
             			"faces": {
             				"north": {"uv": [9, 0, 12.35, 12], "texture": "#0"},
             				"east": {"uv": [9, 0, 11, 12], "texture": "#0"},
             				"south": {"uv": [9, 0, 12.35, 12], "texture": "#0"},
             				"west": {"uv": [9, 0, 11, 12], "texture": "#0"},
             				"up": {"uv": [9, 0, 12.35, 2], "texture": "#0"},
             				"down": {"uv": [9, 0, 12.35, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 0, 0],
             			"to": [2, 12, 2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [3.6, 9.5625, 1]},
             			"faces": {
             				"north": {"uv": [9, 0, 12.35, 12], "texture": "#0"},
             				"east": {"uv": [9, 0, 11, 12], "texture": "#0"},
             				"south": {"uv": [9, 0, 12.35, 12], "texture": "#0"},
             				"west": {"uv": [9, 0, 11, 12], "texture": "#0"},
             				"up": {"uv": [9, 0, 12.35, 2], "texture": "#0"},
             				"down": {"uv": [9, 0, 12.35, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 0, 5.05],
             			"to": [2, 12, 7.05],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1, 6, 6.05]},
             			"faces": {
             				"north": {"uv": [7, 0, 9, 12], "texture": "#0"},
             				"east": {"uv": [7, 0, 9, 12], "texture": "#0"},
             				"south": {"uv": [7, 0, 9, 12], "texture": "#0"},
             				"west": {"uv": [7, 0, 9, 12], "texture": "#0"},
             				"up": {"uv": [7, 0, 9, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [7, 0, 9, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 0, 7.7],
             			"to": [2, 12, 9.7],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1, 6, 8.7]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 12], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 12], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 12], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 12], "texture": "#0"},
             				"up": {"uv": [0, 0, 2, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [0, 0, 2, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 0, 10.35],
             			"to": [2, 12, 12.35],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1, 6, 11.35]},
             			"faces": {
             				"north": {"uv": [7, 0, 9, 12], "texture": "#0"},
             				"east": {"uv": [7, 0, 9, 12], "texture": "#0"},
             				"south": {"uv": [7, 0, 9, 12], "texture": "#0"},
             				"west": {"uv": [7, 0, 9, 12], "texture": "#0"},
             				"up": {"uv": [7, 0, 9, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [7, 0, 9, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 0, 13],
             			"to": [2, 12, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1, 6, 14]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 12], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 12], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 12], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 12], "texture": "#0"},
             				"up": {"uv": [0, 0, 2, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [0, 0, 2, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [5, 0, 0],
             			"to": [7, 12, 2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [6, 6, 1]},
             			"faces": {
             				"north": {"uv": [8, 0, 10, 12], "texture": "#0"},
             				"east": {"uv": [8, 0, 10, 12], "texture": "#0"},
             				"south": {"uv": [8, 0, 10, 12], "texture": "#0"},
             				"west": {"uv": [8, 0, 10, 12], "texture": "#0"},
             				"up": {"uv": [8, 0, 10, 2], "texture": "#0"},
             				"down": {"uv": [8, 0, 10, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.65, 0, 0],
             			"to": [9.65, 12, 2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8.65, 6, 1]},
             			"faces": {
             				"north": {"uv": [2, 0, 4, 12], "texture": "#0"},
             				"east": {"uv": [2, 0, 4, 12], "texture": "#0"},
             				"south": {"uv": [2, 0, 4, 12], "texture": "#0"},
             				"west": {"uv": [2, 0, 4, 12], "texture": "#0"},
             				"up": {"uv": [2, 0, 4, 2], "texture": "#0"},
             				"down": {"uv": [2, 0, 4, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [12.95, 0, 0],
             			"to": [14.95, 12, 2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [13.95, 6, 1]},
             			"faces": {
             				"north": {"uv": [2, 0, 4, 12], "texture": "#0"},
             				"east": {"uv": [2, 0, 4, 12], "texture": "#0"},
             				"south": {"uv": [2, 0, 4, 12], "texture": "#0"},
             				"west": {"uv": [2, 0, 4, 12], "texture": "#0"},
             				"up": {"uv": [2, 0, 4, 2], "texture": "#0"},
             				"down": {"uv": [2, 0, 4, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.3, 0, 0],
             			"to": [12.3, 12, 2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [11.3, 6, 1]},
             			"faces": {
             				"north": {"uv": [8, 0, 10, 12], "texture": "#0"},
             				"east": {"uv": [8, 0, 10, 12], "texture": "#0"},
             				"south": {"uv": [8, 0, 10, 12], "texture": "#0"},
             				"west": {"uv": [8, 0, 10, 12], "texture": "#0"},
             				"up": {"uv": [8, 0, 10, 2], "texture": "#0"},
             				"down": {"uv": [8, 0, 10, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [-0.5, 12, 1],
             			"to": [2.5, 14.25, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1, 13.125, 5]},
             			"faces": {
             				"north": {"uv": [0, 0, 3, 2.25], "texture": "#1"},
             				"east": {"uv": [0, 0, 8, 2.25], "texture": "#1"},
             				"south": {"uv": [0, 0, 3, 2.25], "texture": "#1"},
             				"west": {"uv": [0, 0, 8, 2.25], "texture": "#1"},
             				"up": {"uv": [0, 0, 8, 3], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [0, 0, 8, 3], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [-0.5, 12, 9],
             			"to": [2.5, 14.25, 16],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1, 13.125, 13]},
             			"faces": {
             				"north": {"uv": [0, 0, 3, 2.25], "texture": "#1"},
             				"east": {"uv": [0, 0, 7, 2.25], "texture": "#1"},
             				"south": {"uv": [0, 0, 3, 2.25], "texture": "#1"},
             				"west": {"uv": [0, 0, 7, 2.25], "texture": "#1"},
             				"up": {"uv": [0, 0, 7, 3], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [0, 0, 7, 3], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [-0.501, 12, -0.5],
             			"to": [9.099, 14.251, 2.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [4.299, 13.1255, 1]},
             			"faces": {
             				"north": {"uv": [6.4, 10, 16, 12.251], "texture": "#1"},
             				"east": {"uv": [13, 10, 16, 12.251], "texture": "#1"},
             				"south": {"uv": [6.4, 10, 16, 12.251], "texture": "#1"},
             				"west": {"uv": [13, 10, 16, 12.251], "texture": "#1"},
             				"up": {"uv": [6.4, 10, 16, 13], "texture": "#1"},
             				"down": {"uv": [6.4, 10, 16, 13], "texture": "#1"}
             			}
             		},
             		{
             			"from": [9.099, 12, -0.5],
             			"to": [15.999, 14.251, 2.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [13.899, 13.1255, 1]},
             			"faces": {
             				"north": {"uv": [9.4, 10, 16, 12.251], "texture": "#1"},
             				"east": {"uv": [13, 10, 16, 12.251], "texture": "#1"},
             				"south": {"uv": [9.4, 10, 16, 12.251], "texture": "#1"},
             				"west": {"uv": [13, 10, 16, 12.251], "texture": "#1"},
             				"up": {"uv": [9.4, 10, 16, 13], "texture": "#1"},
             				"down": {"uv": [9.4, 10, 16, 13], "texture": "#1"}
             			}
             		}
             	]
            }
            """;

    public static String SMALL_STAIRAIL_RIGHTCORNER = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [11.35, 0, 0],
             			"to": [13.35, 12, 2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [12.35, 6, 1]},
             			"faces": {
             				"north": {"uv": [1, 0, 3, 12], "texture": "#1"},
             				"east": {"uv": [1, 0, 3, 12], "texture": "#1"},
             				"south": {"uv": [1, 0, 3, 12], "texture": "#1"},
             				"west": {"uv": [1, 0, 3, 12], "texture": "#1"},
             				"up": {"uv": [1, 0, 3, 2], "texture": "#1"},
             				"down": {"uv": [1, 0, 3, 2], "texture": "#1"}
             			}
             		},
             		{
             			"from": [14, 0, 2.551],
             			"to": [16, 12, 4.551],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15, 9.5625, 6.25]},
             			"faces": {
             				"north": {"uv": [8, 0, 10, 12], "texture": "#1"},
             				"east": {"uv": [8, 0, 11.35, 12], "texture": "#1"},
             				"south": {"uv": [8, 0, 10, 12], "texture": "#1"},
             				"west": {"uv": [8, 0, 11.35, 12], "texture": "#1"},
             				"up": {"uv": [8, 0, 11.35, 2], "rotation": 90, "texture": "#1"},
             				"down": {"uv": [8, 0, 11.35, 2], "rotation": 270, "texture": "#1"}
             			}
             		},
             		{
             			"from": [14, 0, 0],
             			"to": [16, 12, 2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15, 9.5625, 3.75]},
             			"faces": {
             				"north": {"uv": [8, 0, 10, 12], "texture": "#1"},
             				"east": {"uv": [8, 0, 11.35, 12], "texture": "#1"},
             				"south": {"uv": [8, 0, 10, 12], "texture": "#1"},
             				"west": {"uv": [8, 0, 11.35, 12], "texture": "#1"},
             				"up": {"uv": [8, 0, 11.35, 2], "rotation": 90, "texture": "#1"},
             				"down": {"uv": [8, 0, 11.35, 2], "rotation": 270, "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.7, 0, 0],
             			"to": [10.7, 12, 2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [9.7, 6, 1]},
             			"faces": {
             				"north": {"uv": [6, 0, 8, 12], "texture": "#1"},
             				"east": {"uv": [6, 0, 8, 12], "texture": "#1"},
             				"south": {"uv": [6, 0, 8, 12], "texture": "#1"},
             				"west": {"uv": [6, 0, 8, 12], "texture": "#1"},
             				"up": {"uv": [6, 0, 8, 2], "texture": "#1"},
             				"down": {"uv": [6, 0, 8, 2], "texture": "#1"}
             			}
             		},
             		{
             			"from": [6.05, 0, 0],
             			"to": [8.05, 12, 2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [7.05, 6, 1]},
             			"faces": {
             				"north": {"uv": [4, 0, 6, 12], "texture": "#1"},
             				"east": {"uv": [4, 0, 6, 12], "texture": "#1"},
             				"south": {"uv": [4, 0, 6, 12], "texture": "#1"},
             				"west": {"uv": [4, 0, 6, 12], "texture": "#1"},
             				"up": {"uv": [4, 0, 6, 2], "texture": "#1"},
             				"down": {"uv": [4, 0, 6, 2], "texture": "#1"}
             			}
             		},
             		{
             			"from": [0.75, 0, 0],
             			"to": [2.75, 12, 2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.75, 6, 1]},
             			"faces": {
             				"north": {"uv": [4, 0, 6, 12], "texture": "#1"},
             				"east": {"uv": [4, 0, 6, 12], "texture": "#1"},
             				"south": {"uv": [4, 0, 6, 12], "texture": "#1"},
             				"west": {"uv": [4, 0, 6, 12], "texture": "#1"},
             				"up": {"uv": [4, 0, 6, 2], "texture": "#1"},
             				"down": {"uv": [4, 0, 6, 2], "texture": "#1"}
             			}
             		},
             		{
             			"from": [3.4, 0, 0],
             			"to": [5.4, 12, 2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [4.4, 6, 1]},
             			"faces": {
             				"north": {"uv": [6, 0, 8, 12], "texture": "#1"},
             				"east": {"uv": [6, 0, 8, 12], "texture": "#1"},
             				"south": {"uv": [6, 0, 8, 12], "texture": "#1"},
             				"west": {"uv": [6, 0, 8, 12], "texture": "#1"},
             				"up": {"uv": [6, 0, 8, 2], "texture": "#1"},
             				"down": {"uv": [6, 0, 8, 2], "texture": "#1"}
             			}
             		},
             		{
             			"from": [14, 0, 5.25],
             			"to": [16, 12, 7.25],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15, 6, 6.25]},
             			"faces": {
             				"north": {"uv": [12, 0, 14, 12], "texture": "#1"},
             				"east": {"uv": [12, 0, 14, 12], "texture": "#1"},
             				"south": {"uv": [12, 0, 14, 12], "texture": "#1"},
             				"west": {"uv": [12, 0, 14, 12], "texture": "#1"},
             				"up": {"uv": [12, 0, 14, 2], "rotation": 90, "texture": "#1"},
             				"down": {"uv": [12, 0, 14, 2], "rotation": 270, "texture": "#1"}
             			}
             		},
             		{
             			"from": [14, 0, 7.9],
             			"to": [16, 12, 9.9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15, 6, 8.9]},
             			"faces": {
             				"north": {"uv": [14, 0, 16, 12], "texture": "#1"},
             				"east": {"uv": [14, 0, 16, 12], "texture": "#1"},
             				"south": {"uv": [14, 0, 16, 12], "texture": "#1"},
             				"west": {"uv": [14, 0, 16, 12], "texture": "#1"},
             				"up": {"uv": [14, 0, 16, 2], "rotation": 90, "texture": "#1"},
             				"down": {"uv": [14, 0, 16, 2], "rotation": 270, "texture": "#1"}
             			}
             		},
             		{
             			"from": [14, 0, 10.55],
             			"to": [16, 12, 12.55],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15, 6, 11.55]},
             			"faces": {
             				"north": {"uv": [12, 0, 14, 12], "texture": "#1"},
             				"east": {"uv": [12, 0, 14, 12], "texture": "#1"},
             				"south": {"uv": [12, 0, 14, 12], "texture": "#1"},
             				"west": {"uv": [12, 0, 14, 12], "texture": "#1"},
             				"up": {"uv": [12, 0, 14, 2], "rotation": 90, "texture": "#1"},
             				"down": {"uv": [12, 0, 14, 2], "rotation": 270, "texture": "#1"}
             			}
             		},
             		{
             			"from": [14, 0, 13.2],
             			"to": [16, 12, 15.2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15, 6, 14.2]},
             			"faces": {
             				"north": {"uv": [14, 0, 16, 12], "texture": "#1"},
             				"east": {"uv": [14, 0, 16, 12], "texture": "#1"},
             				"south": {"uv": [14, 0, 16, 12], "texture": "#1"},
             				"west": {"uv": [14, 0, 16, 12], "texture": "#1"},
             				"up": {"uv": [14, 0, 16, 2], "rotation": 90, "texture": "#1"},
             				"down": {"uv": [14, 0, 16, 2], "rotation": 270, "texture": "#1"}
             			}
             		},
             		{
             			"from": [7, 12, -0.5],
             			"to": [15, 14.25, 2.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [11, 13.125, 1]},
             			"faces": {
             				"north": {"uv": [0, 0, 8, 2.25], "texture": "#0"},
             				"east": {"uv": [0, 0, 3, 2.25], "texture": "#0"},
             				"south": {"uv": [0, 0, 8, 2.25], "texture": "#0"},
             				"west": {"uv": [0, 0, 3, 2.25], "texture": "#0"},
             				"up": {"uv": [0, 0, 8, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 8, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 12, -0.5],
             			"to": [7, 14.25, 2.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [3, 13.125, 1]},
             			"faces": {
             				"north": {"uv": [0, 0, 7, 2.25], "texture": "#0"},
             				"east": {"uv": [0, 0, 3, 2.25], "texture": "#0"},
             				"south": {"uv": [0, 0, 7, 2.25], "texture": "#0"},
             				"west": {"uv": [0, 0, 3, 2.25], "texture": "#0"},
             				"up": {"uv": [0, 0, 7, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 7, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [13.5, 12, -0.501],
             			"to": [16.5, 14.251, 9.099],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15, 13.1255, 4.299]},
             			"faces": {
             				"north": {"uv": [0, 0, 3, 2.251], "texture": "#0"},
             				"east": {"uv": [0, 0, 9.6, 2.251], "texture": "#0"},
             				"south": {"uv": [0, 0, 3, 2.251], "texture": "#0"},
             				"west": {"uv": [0, 0, 9.6, 2.251], "texture": "#0"},
             				"up": {"uv": [0, 0, 9.6, 3], "rotation": 90, "texture": "#0"},
             				"down": {"uv": [0, 0, 9.6, 3], "rotation": 270, "texture": "#0"}
             			}
             		},
             		{
             			"from": [13.5, 12, 9.1],
             			"to": [16.5, 14.251, 16],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15, 13.1255, 13.899]},
             			"faces": {
             				"north": {"uv": [0, 0, 3, 2.251], "texture": "#0"},
             				"east": {"uv": [0, 0, 6.6, 2.251], "texture": "#0"},
             				"south": {"uv": [0, 0, 3, 2.251], "texture": "#0"},
             				"west": {"uv": [0, 0, 6.6, 2.251], "texture": "#0"},
             				"up": {"uv": [0, 0, 6.6, 3], "rotation": 90, "texture": "#0"},
             				"down": {"uv": [0, 0, 6.6, 3], "rotation": 270, "texture": "#0"}
             			}
             		}
             	]
            }
            """;
}
