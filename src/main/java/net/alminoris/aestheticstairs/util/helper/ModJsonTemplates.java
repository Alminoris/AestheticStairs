package net.alminoris.aestheticstairs.util.helper;

public class ModJsonTemplates
{
    public static String YAXIS_ROTATED_BLOCKSTATE_TEMPLATE = """
            {
              "variants": {
                "facing=north": { "model": "aestheticladders:block/NAME" },
                "facing=south": { "model": "aestheticladders:block/NAME", "y": 180 },
                "facing=west": { "model": "aestheticladders:block/NAME", "y": 270 },
                "facing=east": { "model": "aestheticladders:block/NAME", "y": 90 }
              }
            }
            """;

    public static String LADDER_BLOCK_MODEL = """
            {
                "ambientocclusion": false,
                "textures": {
                    "particle": "aestheticladders:block/NAME",
                    "texture": "aestheticladders:block/NAME"
                },
                "elements": [
                    {   "from": [ 0, 0, 15.2 ],
                        "to": [ 16, 16, 15.2 ],
                        "shade": false,
                        "faces": {
                            "north": { "uv": [ 0, 0, 16, 16 ], "texture": "#texture" },
                            "south": { "uv": [ 16, 0, 0, 16 ], "texture": "#texture" }
                        }
                    }
                ]
            }
            
            """;
}
