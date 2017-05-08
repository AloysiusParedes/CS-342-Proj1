Author: Aloysius Paredes
Code#:	879P
File:	README.txt
Descr:	readme file for CS 342 Fall 2016 Program 1: Mid Meeting

Starting point for program:	Start out with the file "apared5_cs342Prog1.java". Also make sure that "Edge.java" and "Vertex.java" is in the same project folder in order for the program to recognize the Vertex and Java public classes. Also make sure the "CityNames.txt", "CityDistances.txt", and "Participants.txt" is in the same project folder so that it can read the files properly into the adjacency list. The program should let you know if you read the wrong files in.

Description of program completeness:	My program completes all three required steps (not the extra credit).
	Completion:
		1. Creating Adjacency List and printing out all neighbors/connections from all cities:
			DONE
		2. Using Dijkstra's Algorithm (Modified Prim's Algorithm) to find the shortest distance from a particular "start" city to all other cities in the adjacency list:
			DONE
		3. Finding the "Mid" (our definition) of all participants to figure out which city for the collection of participants to travel to along with the distance to travel.

PROGRAM OUTPUT:
Author Code Number:	879P
Class:				CS 342, Fall 2016
Program 1:			Mid Meeting
**** PRINTING ADJACENCY LIST ****
0. Huntsville, AL -> (1: 100.0) (101: 119.0) (193: 131.0) (194: 102.0) 
1. Birmingham, AL -> (0: 100.0) (2: 91.0) (3: 258.0) (49: 146.0) (52: 268.0) (101: 178.0) (102: 117.0) (103: 145.0) (192: 237.0) (194: 147.0) 
2. Montgomery, AL -> (1: 91.0) (3: 170.0) (49: 160.0) (51: 335.0) (52: 213.0) (102: 192.0) (103: 156.0) (38: 213.0) 
3. Mobile, AL -> (1: 258.0) (2: 170.0) (38: 243.0) (81: 201.0) (82: 143.0) (103: 134.0) 
4. Grand Canyon, AZ -> (5: 140.0) (6: 61.0) (7: 88.0) (35: 316.0) 
5. Page, AZ -> (4: 140.0) (7: 135.0) (131: 271.0) (134: 257.0) (220: 117.0) (221: 237.0) 
6. Williams, AZ -> (4: 61.0) (7: 35.0) (26: 175.0) (27: 269.0) (131: 217.0) 
7. Flagstaff, AZ -> (4: 88.0) (5: 135.0) (6: 35.0) (8: 144.0) (35: 311.0) (134: 185.0) 
8. Phoenix, AZ -> (7: 144.0) (9: 114.0) (27: 150.0) (121: 184.0) (131: 293.0) (140: 378.0) (142: 269.0) 
9. Tucson, AZ -> (8: 114.0) (10: 66.0) (121: 273.0) (134: 331.0) (142: 156.0) 
10. Nogales, AZ -> (9: 66.0) 
11. Ft Smith, AR -> (12: 157.0) (13: 182.0) (74: 209.0) (165: 181.0) (166: 116.0) (192: 286.0) 
12. Little Rock, AR -> (11: 157.0) (13: 143.0) (14: 128.0) (78: 212.0) (79: 297.0) (110: 214.0) (111: 195.0) (192: 135.0) 
13. Texarkana, AR -> (11: 182.0) (12: 143.0) (14: 178.0) (78: 71.0) (167: 167.0) (202: 323.0) (209: 180.0) (210: 375.0) (216: 297.0) 
14. Lake Village, AR -> (12: 128.0) (13: 178.0) (79: 179.0) (82: 315.0) (102: 182.0) (192: 171.0) 
15. Eureka, CA -> (16: 147.0) (17: 271.0) (171: 216.0) (173: 166.0) 
16. Redding, CA -> (15: 147.0) (17: 217.0) (18: 162.0) (129: 199.0) (173: 176.0) (174: 140.0) (179: 196.0) 
17. San Francisco, CA -> (15: 271.0) (16: 217.0) (18: 87.0) (20: 186.0) (22: 232.0) (23: 284.0) 
18. Sacramento, CA -> (16: 162.0) (17: 87.0) (19: 164.0) (20: 169.0) (129: 132.0) 
19. Yosemite, CA -> (18: 164.0) (20: 94.0) (21: 139.0) 
20. Fresno, CA -> (17: 186.0) (18: 169.0) (19: 94.0) (22: 138.0) (23: 110.0) 
21. Bishop, CA -> (19: 139.0) (25: 266.0) (28: 354.0) (127: 318.0) (129: 202.0) (130: 283.0) (131: 266.0) 
22. San Luis Obispo, CA -> (17: 232.0) (20: 138.0) (25: 188.0) 
23. Bakersfield, CA -> (17: 284.0) (20: 110.0) (24: 129.0) (25: 111.0) 
24. Barstow, CA -> (23: 129.0) (25: 114.0) (26: 144.0) (28: 176.0) (131: 157.0) 
25. Los Angeles, CA -> (21: 266.0) (22: 188.0) (23: 111.0) (24: 114.0) (27: 223.0) (28: 120.0) (121: 286.0) 
26. Needles, CA -> (6: 175.0) (24: 144.0) (27: 96.0) (131: 112.0) 
27. Blythe, CA -> (6: 269.0) (8: 150.0) (25: 223.0) (26: 96.0) (121: 90.0) 
28. San Diego, CA -> (21: 354.0) (24: 176.0) (25: 120.0) (121: 173.0) 
29. Craig, CO -> (31: 207.0) (32: 152.0) (217: 293.0) (244: 118.0) 
30. Estes Park, CO -> (31: 70.0) (244: 230.0) (245: 87.0) 
31. Denver, CO -> (29: 207.0) (30: 70.0) (32: 244.0) (245: 101.0) (122: 263.0) (68: 254.0) (33: 152.0) (34: 113.0) (35: 336.0) 
32. Grand Junction, CO -> (29: 152.0) (31: 244.0) (34: 285.0) (35: 168.0) (222: 101.0) 
33. Kit Carson, CO -> (31: 152.0) (34: 131.0) (68: 111.0) (122: 266.0) (136: 190.0) (201: 271.0) 
34. Pueblo, CO -> (31: 113.0) (32: 285.0) (33: 131.0) (35: 270.0) (71: 357.0) (72: 273.0) (136: 106.0) 
35. Durango, CO -> (4: 316.0) (7: 311.0) (31: 336.0) (32: 168.0) (34: 270.0) (134: 173.0) (135: 241.0) (136: 278.0) (139: 214.0) (222: 211.0) 
36. Hartford, CT -> (37: 106.0) (89: 100.0) (147: 113.0) (148: 118.0) 
37. Newport, RI -> (36: 106.0) (89: 70.0) (148: 182.0) 
38. Tallahassee, FL -> (2: 213.0) (3: 243.0) (39: 163.0) (40: 149.0) (44: 274.0) (51: 273.0) (52: 92.0) 
39. Jacksonville, FL -> (38: 163.0) (40: 71.0) (41: 93.0) (50: 262.0) (51: 139.0) (52: 166.0) 
40. Gainesville, FL -> (38: 149.0) (39: 71.0) (42: 114.0) (44: 132.0) (47: 341.0) (52: 151.0) 
41. Daytona Beach, FL -> (39: 93.0) (42: 54.0) (43: 69.0) 
42. Orlando, FL -> (40: 114.0) (41: 54.0) (43: 49.0) (44: 84.0) 
43. Cocoa, FL -> (41: 69.0) (42: 49.0) (45: 62.0) 
44. Tampa, FL -> (38: 274.0) (40: 132.0) (42: 84.0) (45: 140.0) (46: 126.0) 
45. Vero Beach, FL -> (43: 62.0) (44: 140.0) (47: 151.0) 
46. Ft Myers, FL -> (44: 126.0) (47: 159.0) 
47. Miami, FL -> (40: 341.0) (45: 151.0) (46: 159.0) (48: 157.0) 
48. Key West, FL -> (47: 157.0) 
49. Atlanta, GA -> (1: 146.0) (2: 160.0) (50: 147.0) (51: 248.0) (52: 180.0) (149: 198.0) (152: 244.0) (183: 213.0) (194: 118.0) (195: 202.0) 
50. Augusta, GA -> (39: 262.0) (49: 147.0) (51: 143.0) (52: 227.0) (149: 188.0) (183: 70.0) (186: 175.0) 
51. Savannah, GA -> (2: 335.0) (38: 273.0) (39: 139.0) (49: 248.0) (50: 143.0) (183: 156.0) (184: 176.0) (186: 107.0) 
52. Tifton, GA -> (1: 268.0) (2: 213.0) (38: 92.0) (39: 166.0) (40: 151.0) (49: 180.0) (50: 227.0) 
53. Bonners Ferry, ID -> (112: 175.0) (113: 212.0) (232: 107.0) 
54. Boise, ID -> (55: 279.0) (56: 128.0) (113: 367.0) (127: 257.0) (177: 222.0) (178: 188.0) (232: 426.0) 
55. Idaho Falls, ID -> (54: 279.0) (56: 160.0) (117: 206.0) (118: 231.0) (217: 216.0) (243: 371.0) (244: 401.0) 
56. Twin Falls, ID -> (54: 128.0) (55: 160.0) (113: 384.0) (128: 113.0) (217: 219.0) (244: 466.0) 
57. Chicago, IL -> (58: 154.0) (59: 201.0) (60: 373.0) (61: 165.0) (62: 186.0) (64: 178.0) (66: 174.0) (95: 282.0) (96: 179.0) (159: 245.0) (237: 146.0) (239: 92.0) 
58. Peoria, IL -> (57: 154.0) (59: 72.0) (61: 263.0) (62: 212.0) (66: 98.0) (67: 264.0) (106: 175.0) (237: 202.0) 
59. Springfield, IL -> (57: 201.0) (58: 72.0) (60: 242.0) (62: 212.0) (106: 109.0) (109: 101.0) 
60. Cairo, IL -> (57: 373.0) (59: 242.0) (62: 305.0) (75: 254.0) (76: 291.0) (101: 169.0) (109: 150.0) (111: 77.0) (192: 167.0) (193: 172.0) 
61. Ft Wayne, IN -> (57: 165.0) (58: 263.0) (62: 127.0) (159: 101.0) (162: 172.0) (180: 315.0) 
62. Indianapolis, IN -> (57: 186.0) (58: 212.0) (59: 212.0) (60: 305.0) (61: 127.0) (75: 114.0) (96: 297.0) (162: 175.0) (109: 243.0) (163: 112.0) 
63. Decorah, IA -> (64: 103.0) (99: 159.0) (106: 276.0) 
64. Dubuque, IA -> (57: 178.0) (63: 103.0) (65: 306.0) (66: 70.0) (67: 200.0) (191: 396.0) (236: 122.0) (237: 93.0) 
65. Sioux City, IA -> (64: 306.0) (67: 199.0) (99: 271.0) (124: 184.0) (126: 97.0) (187: 428.0) (191: 84.0) (243: 558.0) 
66. Davenport, IA -> (57: 174.0) (58: 98.0) (64: 70.0) (67: 165.0) 
67. Des Moines, IA -> (58: 264.0) (64: 200.0) (65: 199.0) (66: 165.0) (100: 148.0) (106: 233.0) (107: 194.0) (110: 357.0) (126: 135.0) 
68. Oakley, KS -> (31: 254.0) (33: 111.0) (69: 87.0) (71: 150.0) (72: 134.0) (122: 156.0) (123: 194.0) 
69. Hays, KS -> (68: 87.0) (70: 98.0) (71: 66.0) (123: 148.0) 
70. Salina, KS -> (69: 98.0) (71: 82.0) (105: 211.0) (107: 175.0) (125: 189.0) 
71. Great Bend, KS -> (34: 357.0) (68: 150.0) (69: 66.0) (70: 82.0) (72: 85.0) (73: 120.0) (124: 255.0) 
72. Dodge City, KS -> (34: 273.0) (68: 134.0) (71: 85.0) (73: 153.0) (123: 251.0) (164: 122.0) (165: 310.0) (202: 338.0) 
73. Wichita, KS -> (71: 120.0) (72: 153.0) (74: 153.0) (107: 199.0) (110: 268.0) (125: 276.0) (164: 251.0) (165: 161.0) (166: 176.0) 
74. Ft Scott, KS -> (11: 209.0) (73: 153.0) (107: 93.0) (108: 174.0) (166: 169.0) 
75. Louisville, KY -> (60: 254.0) (62: 114.0) (76: 79.0) (77: 90.0) (109: 258.0) (163: 100.0) 
76. Lexington, KY -> (60: 291.0) (75: 79.0) (163: 83.0) (233: 174.0) (193: 212.0) (195: 170.0) 
77. Park City, KY -> (75: 90.0) (193: 86.0) 
78. Shreveport, LA -> (12: 212.0) (13: 71.0) (79: 124.0) (104: 217.0) (209: 180.0) (210: 329.0) (216: 242.0) 
79. Alexandria, LA -> (12: 297.0) (14: 179.0) (78: 124.0) (80: 97.0) (81: 123.0) (104: 190.0) 
80. Lake Charles, LA -> (79: 97.0) (81: 126.0) (216: 143.0) 
81. Baton Rouge, LA -> (3: 201.0) (79: 123.0) (80: 126.0) (82: 80.0) (103: 255.0) 
82. New Orleans, LA -> (3: 143.0) (14: 315.0) (81: 80.0) (103: 198.0) (104: 185.0) 
83. Houlton, ME -> (84: 118.0) (87: 91.0) 
84. Bangor, ME -> (83: 118.0) (85: 44.0) (86: 130.0) (87: 98.0) 
85. Hulls Cove, ME -> (84: 44.0) (86: 171.0) (87: 118.0) 
86. Portland, ME -> (84: 130.0) (85: 171.0) (89: 112.0) (132: 109.0) 
87. Calais, ME -> (83: 91.0) (84: 98.0) (85: 118.0) 
88. Baltimore, MD -> (133: 154.0) (181: 78.0) (182: 106.0) (246: 40.0) 
89. Boston, MA -> (36: 100.0) (37: 70.0) (86: 112.0) (132: 68.0) (147: 169.0) 
90. Marquette, MI -> (91: 67.0) (92: 165.0) (93: 167.0) (98: 251.0) 
91. Escanaba, MI -> (90: 67.0) (92: 179.0) (93: 146.0) (98: 285.0) (99: 376.0) (238: 110.0) 
92. Sault Ste Marie, MI -> (90: 165.0) (91: 179.0) (93: 57.0) 
93. Mackinaw City, MI -> (90: 167.0) (91: 146.0) (92: 57.0) (94: 190.0) (96: 241.0) 
94. Saginaw, MI -> (93: 190.0) (95: 102.0) (159: 140.0) 
95. Detroit, MI -> (57: 282.0) (94: 102.0) (159: 57.0) (96: 157.0) 
96. Grand Rapids, MI -> (57: 179.0) (62: 297.0) (93: 241.0) (95: 157.0) (159: 186.0) 
97. International Falls, MN -> (98: 164.0) (156: 258.0) (157: 279.0) 
98. Duluth, MN -> (90: 251.0) (91: 285.0) (97: 164.0) (99: 154.0) (156: 265.0) (157: 252.0) (235: 155.0) (238: 331.0) 
99. Minneapolis, MN -> (63: 159.0) (65: 271.0) (91: 376.0) (98: 154.0) (100: 97.0) (126: 367.0) (157: 234.0) (190: 209.0) (191: 236.0) (235: 91.0) (236: 160.0) 
100. Albert Lea, MN -> (67: 148.0) (99: 97.0) (191: 176.0) (236: 125.0) 
101. Corinth, MS -> (0: 119.0) (1: 178.0) (60: 169.0) (102: 119.0) (192: 96.0) 
102. Columbus, MS -> (1: 117.0) (2: 192.0) (14: 182.0) (101: 119.0) (103: 90.0) (192: 177.0) 
103. Meridian, MS -> (1: 145.0) (2: 156.0) (3: 134.0) (81: 255.0) (82: 198.0) (102: 90.0) (104: 92.0) 
104. Jackson, MS -> (78: 217.0) (79: 190.0) (82: 185.0) (103: 92.0) (192: 209.0) 
105. St Joseph, MO -> (70: 211.0) (106: 193.0) (107: 53.0) (125: 141.0) (126: 131.0) 
106. Hannibal, MO -> (58: 175.0) (59: 109.0) (63: 276.0) (67: 233.0) (105: 193.0) (107: 209.0) (108: 121.0) (109: 117.0) 
107. Kansas City, MO -> (67: 194.0) (70: 175.0) (73: 199.0) (74: 93.0) (105: 53.0) (106: 209.0) (109: 249.0) (110: 166.0) 
108. Jefferson City, MO -> (74: 174.0) (106: 121.0) (109: 133.0) (110: 138.0) 
109. St Louis, MO -> (59: 101.0) (60: 150.0) (62: 243.0) (75: 258.0) (106: 117.0) (107: 249.0) (108: 133.0) (110: 216.0) (111: 152.0) 
110. Springfield, MO -> (12: 214.0) (67: 357.0) (73: 268.0) (107: 166.0) (108: 138.0) (109: 216.0) (111: 191.0) (166: 182.0) (167: 292.0) (192: 286.0) 
111. Poplar Bluff, MO -> (12: 195.0) (60: 77.0) (109: 152.0) (110: 191.0) (192: 154.0) 
112. West Glacier, MT -> (53: 175.0) (113: 137.0) (114: 229.0) (115: 192.0) (116: 214.0) 
113. Missoula, MT -> (53: 212.0) (54: 367.0) (56: 384.0) (112: 137.0) (116: 114.0) (117: 119.0) (177: 401.0) (232: 197.0) 
114. Havre, MT -> (112: 229.0) (115: 113.0) (120: 333.0) (154: 302.0) 
115. Great Falls, MT -> (112: 192.0) (114: 113.0) (116: 90.0) (119: 219.0) (120: 317.0) (158: 544.0) 
116. Helena, MT -> (112: 214.0) (113: 114.0) (115: 90.0) (117: 66.0) (118: 122.0) (120: 381.0) 
117. Butte, MT -> (55: 206.0) (113: 119.0) (116: 66.0) (118: 109.0) 
118. Livingston, MT -> (55: 231.0) (116: 122.0) (117: 109.0) (119: 117.0) (240: 62.0) 
119. Billings, MT -> (115: 219.0) (118: 117.0) (120: 145.0) (242: 130.0) 
120. Miles City, MT -> (114: 333.0) (115: 317.0) (116: 381.0) (119: 145.0) (154: 181.0) (158: 271.0) (187: 234.0) (189: 388.0) (242: 200.0) 
121. Yuma, AZ -> (8: 184.0) (9: 273.0) (25: 286.0) (27: 90.0) (28: 173.0) 
122. North Platte, NE -> (31: 263.0) (33: 266.0) (68: 156.0) (123: 99.0) (187: 342.0) (188: 260.0) (243: 400.0) (245: 220.0) 
123. Kearney, NE -> (68: 194.0) (69: 148.0) (72: 251.0) (122: 99.0) (124: 50.0) (125: 129.0) 
124. Grand Island, NE -> (65: 184.0) (71: 255.0) (123: 50.0) (188: 341.0) 
125. Lincoln, NE -> (70: 189.0) (73: 276.0) (105: 141.0) (123: 129.0) (126: 58.0) 
126. Omaha, NE -> (65: 97.0) (67: 135.0) (99: 367.0) (105: 131.0) (125: 58.0) (166: 380.0) 
127. Winnemucca, NV -> (21: 318.0) (54: 257.0) (128: 174.0) (129: 165.0) (130: 271.0) (131: 472.0) (178: 220.0) (179: 211.0) 
128. Wells, NV -> (56: 113.0) (127: 174.0) (130: 139.0) (217: 180.0) 
129. Reno, NV -> (16: 199.0) (18: 132.0) (21: 202.0) (127: 165.0) (130: 319.0) (131: 448.0) (174: 270.0) (179: 225.0) 
130. Ely, NV -> (21: 283.0) (127: 271.0) (128: 139.0) (129: 319.0) (131: 242.0) (217: 241.0) (218: 236.0) (219: 215.0) (221: 223.0) 
131. Las Vegas, NV -> (5: 271.0) (6: 217.0) (8: 293.0) (21: 266.0) (24: 157.0) (26: 112.0) (127: 472.0) (129: 448.0) (130: 242.0) (219: 120.0) 
132. Concord, NH -> (86: 109.0) (89: 68.0) (147: 149.0) (223: 152.0) 
133. Atlantic City, NJ -> (88: 154.0) (148: 125.0) (182: 62.0) (226: 322.0) 
134. Gallup, NM -> (5: 257.0) (7: 185.0) (9: 331.0) (35: 173.0) (139: 138.0) (140: 192.0) (222: 300.0) 
135. Santa Fe, NM -> (35: 241.0) (136: 175.0) (137: 169.0) (139: 63.0) (141: 194.0) 
136. Raton, NM -> (33: 190.0) (34: 106.0) (35: 278.0) (135: 175.0) (137: 177.0) (164: 188.0) (201: 216.0) 
137. Tucumcari, NM -> (135: 169.0) (136: 177.0) (138: 83.0) (139: 175.0) (141: 161.0) (164: 165.0) (201: 112.0) 
138. Clovis, NM -> (137: 83.0) (139: 221.0) (141: 110.0) (200: 99.0) (201: 105.0) (202: 247.0) 
139. Albuquerque, NM -> (35: 214.0) (134: 138.0) (135: 63.0) (137: 175.0) (138: 221.0) (140: 76.0) 
140. Socorro, NM -> (8: 378.0) (134: 192.0) (139: 76.0) (141: 164.0) (142: 217.0) (196: 190.0) 
141. Roswell, NM -> (135: 194.0) (137: 161.0) (138: 110.0) (140: 164.0) (142: 310.0) (143: 76.0) (196: 205.0) (200: 175.0) (203: 231.0) 
142. Lordsburg, NM -> (8: 269.0) (9: 156.0) (140: 217.0) (141: 310.0) (196: 162.0) 
143. Carlsbad, NM -> (141: 76.0) (196: 164.0) (197: 139.0) (203: 202.0) 
144. Buffalo, NY -> (145: 150.0) (146: 212.0) (160: 193.0) (180: 219.0) (181: 329.0) (247: 279.0) 
145. Syracuse, NY -> (144: 150.0) (146: 70.0) (147: 145.0) (247: 130.0) 
146. Watertown, NY -> (144: 212.0) (145: 70.0) 
147. Albany, NY -> (36: 113.0) (89: 169.0) (132: 149.0) (145: 145.0) (148: 156.0) (223: 152.0) (247: 180.0) 
148. New York, NY -> (36: 118.0) (37: 182.0) (133: 125.0) (147: 156.0) (161: 395.0) (181: 172.0) (182: 97.0) (247: 120.0) 
149. Asheville, NC -> (49: 198.0) (50: 188.0) (150: 172.0) (152: 129.0) (183: 157.0) (194: 229.0) (195: 116.0) (224: 243.0) (234: 200.0) 
150. Greensboro, NC -> (149: 172.0) (151: 76.0) (152: 92.0) (224: 99.0) (225: 201.0) 
151. Raleigh, NC -> (150: 76.0) (152: 166.0) (153: 131.0) (183: 227.0) (184: 150.0) (224: 176.0) (225: 169.0) (226: 184.0) 
152. Charlotte, NC -> (49: 244.0) (149: 129.0) (150: 92.0) (151: 166.0) (153: 197.0) (183: 94.0) 
153. Wilmington, NC -> (151: 131.0) (152: 197.0) (184: 130.0) (185: 74.0) (225: 258.0) (226: 289.0) 
154. Williston, ND -> (114: 302.0) (120: 181.0) (155: 125.0) (187: 346.0) 
155. Minot, ND -> (154: 125.0) (156: 210.0) (157: 269.0) (158: 110.0) (189: 274.0) 
156. Grand Forks, ND -> (97: 258.0) (98: 265.0) (155: 210.0) (157: 81.0) 
157. Fargo, ND -> (97: 279.0) (98: 252.0) (99: 234.0) (155: 269.0) (156: 81.0) (158: 196.0) (189: 187.0) (190: 144.0) 
158. Bismarck, ND -> (115: 544.0) (120: 271.0) (155: 110.0) (157: 196.0) (188: 209.0) (189: 201.0) 
159. Toledo, OH -> (57: 245.0) (61: 101.0) (94: 140.0) (95: 57.0) (96: 186.0) (160: 115.0) (161: 172.0) (162: 143.0) (163: 203.0) 
160. Cleveland, OH -> (144: 193.0) (159: 115.0) (161: 73.0) (162: 142.0) (233: 252.0) 
161. Youngstown, OH -> (148: 395.0) (159: 172.0) (160: 73.0) (180: 67.0) (181: 263.0) 
162. Columbus, OH -> (61: 172.0) (62: 175.0) (159: 143.0) (160: 142.0) (163: 106.0) (180: 185.0) (233: 163.0) (246: 417.0) 
163. Cincinnati, OH -> (62: 112.0) (75: 100.0) (76: 83.0) (159: 203.0) (162: 106.0) (233: 198.0) 
164. Guymon, OK -> (72: 122.0) (73: 251.0) (136: 188.0) (137: 165.0) (201: 122.0) 
165. Oklahoma City, OK -> (11: 181.0) (72: 310.0) (73: 161.0) (166: 106.0) (167: 129.0) (201: 258.0) (202: 164.0) (209: 207.0) 
166. Tulsa, OK -> (11: 116.0) (73: 176.0) (74: 169.0) (110: 182.0) (126: 380.0) (165: 106.0) (167: 131.0) 
167. Atoka, OK -> (13: 167.0) (110: 292.0) (165: 129.0) (166: 131.0) (209: 125.0) 
168. Astoria, OR -> (169: 98.0) (170: 133.0) (227: 210.0) (229: 176.0) 
169. Portland, OR -> (168: 98.0) (170: 134.0) (172: 109.0) (175: 162.0) (176: 103.0) (229: 173.0) 
170. Newport, OR -> (168: 133.0) (169: 134.0) (171: 98.0) 
171. Coos Bay, OR -> (15: 216.0) (170: 98.0) 
172. Eugene, OR -> (169: 109.0) (173: 138.0) (174: 172.0) (175: 115.0) 
173. Grants Pass, OR -> (15: 166.0) (16: 176.0) (172: 138.0) (174: 102.0) 
174. Klamath Falls, OR -> (16: 140.0) (129: 270.0) (172: 172.0) (173: 102.0) (175: 137.0) (179: 96.0) 
175. Bend, OR -> (169: 162.0) (172: 115.0) (174: 137.0) (176: 136.0) (178: 130.0) (179: 175.0) 
176. Biggs, OR -> (169: 103.0) (175: 136.0) (177: 106.0) (230: 118.0) (232: 249.0) 
177. Pendleton, OR -> (54: 222.0) (113: 401.0) (176: 106.0) (178: 196.0) (230: 177.0) (232: 205.0) 
178. Burns, OR -> (54: 188.0) (127: 220.0) (175: 130.0) (177: 196.0) (179: 139.0) 
179. Lakeview, OR -> (16: 196.0) (127: 211.0) (129: 225.0) (174: 96.0) (175: 175.0) (178: 139.0) 
180. Pittsburgh, PA -> (61: 315.0) (144: 219.0) (161: 67.0) (162: 185.0) (181: 203.0) (224: 345.0) (233: 228.0) (246: 244.0) 
181. Harrisburg, PA -> (88: 78.0) (144: 329.0) (148: 172.0) (161: 263.0) (180: 203.0) (182: 106.0) (224: 294.0) (233: 365.0) (246: 120.0) (247: 124.0) 
182. Philadelphia, PA -> (88: 106.0) (133: 62.0) (148: 97.0) (181: 106.0) (226: 273.0) (247: 124.0) 
183. Columbia, SC -> (49: 213.0) (50: 70.0) (51: 156.0) (149: 157.0) (151: 227.0) (152: 94.0) (184: 81.0) (186: 112.0) (234: 262.0) 
184. Florence, SC -> (51: 176.0) (151: 150.0) (153: 130.0) (183: 81.0) (185: 67.0) 
185. Myrtle Beach, SC -> (153: 74.0) (184: 67.0) (186: 97.0) 
186. Charleston, SC -> (50: 175.0) (51: 107.0) (183: 112.0) (185: 97.0) 
187. Rapid City, SD -> (65: 428.0) (120: 234.0) (122: 342.0) (154: 346.0) (188: 172.0) (191: 347.0) (242: 243.0) (243: 254.0) (245: 308.0) 
188. Pierre, SD -> (122: 260.0) (124: 341.0) (158: 209.0) (187: 172.0) (189: 160.0) (191: 224.0) 
189. Aberdeen, SD -> (120: 388.0) (155: 274.0) (157: 187.0) (158: 201.0) (188: 160.0) (190: 104.0) 
190. Watertown, SD -> (99: 209.0) (157: 144.0) (189: 104.0) (191: 104.0) 
191. Sioux Falls, SD -> (64: 396.0) (65: 84.0) (99: 236.0) (100: 176.0) (187: 347.0) (188: 224.0) (190: 104.0) 
192. Memphis, TN -> (1: 237.0) (11: 286.0) (12: 135.0) (14: 171.0) (60: 167.0) (101: 96.0) (102: 177.0) (104: 209.0) (110: 286.0) (111: 154.0) (193: 212.0) 
193. Nashville, TN -> (0: 131.0) (60: 172.0) (76: 212.0) (77: 86.0) (192: 212.0) (194: 132.0) (195: 179.0) 
194. Chattanooga, TN -> (0: 102.0) (1: 147.0) (49: 118.0) (149: 229.0) (193: 132.0) (195: 112.0) 
195. Knoxville, TN -> (49: 202.0) (76: 170.0) (149: 116.0) (193: 179.0) (194: 112.0) (224: 259.0) (233: 311.0) 
196. El Paso, TX -> (140: 190.0) (141: 205.0) (142: 162.0) (143: 164.0) (197: 240.0) (198: 251.0) (199: 284.0) 
197. Ft Stockton, TX -> (143: 139.0) (196: 240.0) (198: 58.0) (199: 85.0) (204: 162.0) (205: 185.0) (210: 336.0) (211: 311.0) 
198. Marathon, TX -> (196: 251.0) (197: 58.0) (205: 173.0) 
199. Odessa, TX -> (196: 284.0) (197: 85.0) (200: 142.0) (206: 217.0) 
200. Lubbock, TX -> (138: 99.0) (141: 175.0) (199: 142.0) (201: 114.0) (202: 179.0) (203: 86.0) 
201. Amarillo, TX -> (33: 271.0) (136: 216.0) (137: 112.0) (138: 105.0) (164: 122.0) (165: 258.0) (200: 114.0) (202: 174.0) 
202. Vernon, TX -> (13: 323.0) (72: 338.0) (138: 247.0) (165: 164.0) (200: 179.0) (201: 174.0) (206: 140.0) (208: 165.0) 
203. Snyder, TX -> (141: 231.0) (143: 202.0) (200: 86.0) (204: 112.0) (207: 159.0) (208: 230.0) 
204. San Angelo, TX -> (197: 162.0) (203: 112.0) (205: 156.0) (207: 96.0) (211: 217.0) 
205. Del Rio, TX -> (197: 185.0) (198: 173.0) (204: 156.0) (211: 153.0) (212: 177.0) 
206. Cisco, TX -> (199: 217.0) (202: 140.0) (207: 48.0) (208: 105.0) 
207. Brownwood, TX -> (203: 159.0) (204: 96.0) (206: 48.0) (209: 170.0) (210: 177.0) (211: 188.0) 
208. Ft Worth, TX -> (202: 165.0) (203: 230.0) (206: 105.0) (209: 32.0) 
209. Dallas, TX -> (13: 180.0) (78: 180.0) (165: 207.0) (167: 125.0) (207: 170.0) (208: 32.0) (210: 195.0) (216: 239.0) 
210. Austin, TX -> (13: 375.0) (78: 329.0) (197: 336.0) (207: 177.0) (209: 195.0) (211: 80.0) (215: 124.0) (216: 162.0) 
211. San Antonio, TX -> (197: 311.0) (204: 217.0) (205: 153.0) (207: 188.0) (210: 80.0) (212: 154.0) (213: 277.0) (215: 118.0) (216: 197.0) 
212. Laredo, TX -> (205: 177.0) (211: 154.0) (213: 205.0) (214: 143.0) (215: 184.0) 
213. Brownsville, TX -> (211: 277.0) (212: 205.0) (214: 164.0) 
214. Corpus Christi, TX -> (212: 143.0) (213: 164.0) (215: 96.0) 
215. Victoria, TX -> (210: 124.0) (211: 118.0) (212: 184.0) (214: 96.0) (216: 127.0) 
216. Houston, TX -> (13: 297.0) (78: 242.0) (80: 143.0) (209: 239.0) (210: 162.0) (211: 197.0) (215: 127.0) 
217. Salt Lake City, UT -> (29: 293.0) (55: 216.0) (56: 219.0) (128: 180.0) (130: 241.0) (218: 53.0) (244: 291.0) 
218. Spanish Fork, UT -> (130: 236.0) (217: 53.0) (219: 250.0) (221: 88.0) (222: 130.0) 
219. St George, UT -> (130: 215.0) (131: 120.0) (218: 250.0) (220: 45.0) 
220. Springdale, UT -> (5: 117.0) (219: 45.0) (221: 188.0) 
221. Salina, UT -> (5: 237.0) (130: 223.0) (218: 88.0) (220: 188.0) (222: 107.0) 
222. Green River, UT -> (32: 101.0) (35: 211.0) (134: 300.0) (218: 130.0) (221: 107.0) 
223. Burlington, VT -> (132: 152.0) (147: 152.0) 
224. Roanoke, VA -> (149: 243.0) (150: 99.0) (151: 176.0) (180: 345.0) (181: 294.0) (195: 259.0) (225: 188.0) (233: 182.0) (246: 247.0) 
225. Richmond, VA -> (150: 201.0) (151: 169.0) (153: 258.0) (224: 188.0) (226: 92.0) (233: 318.0) (246: 107.0) 
226. Norfolk, VA -> (133: 322.0) (151: 184.0) (153: 289.0) (182: 273.0) (225: 92.0) 
227. Port Angeles, WA -> (168: 210.0) (228: 88.0) (229: 83.0) 
228. Everett, WA -> (227: 88.0) (229: 29.0) (230: 129.0) (231: 123.0) 
229. Seattle, WA -> (168: 176.0) (169: 173.0) (227: 83.0) (228: 29.0) (230: 107.0) 
230. Ellensburg, WA -> (176: 118.0) (177: 177.0) (228: 129.0) (229: 107.0) (232: 173.0) 
231. Wenatchee, WA -> (228: 123.0) (232: 169.0) 
232. Spokane, WA -> (53: 107.0) (54: 426.0) (113: 197.0) (176: 249.0) (177: 205.0) (230: 173.0) (231: 169.0) 
233. Charleston, WV -> (76: 174.0) (160: 252.0) (162: 163.0) (163: 198.0) (180: 228.0) (181: 365.0) (195: 311.0) (224: 182.0) (225: 318.0) (234: 108.0) (246: 362.0) 
234. Bluefield, WV -> (149: 200.0) (183: 262.0) (233: 108.0) 
235. Eau Claire, WI -> (98: 155.0) (99: 91.0) (236: 87.0) (237: 181.0) (238: 193.0) 
236. La Crosse, WI -> (64: 122.0) (99: 160.0) (100: 125.0) (235: 87.0) (237: 145.0) (238: 202.0) 
237. Madison, WI -> (57: 146.0) (58: 202.0) (64: 93.0) (235: 181.0) (236: 145.0) (238: 139.0) (239: 78.0) 
238. Green Bay, WI -> (91: 110.0) (98: 331.0) (235: 193.0) (236: 202.0) (237: 139.0) (239: 116.0) 
239. Milwaukee, WI -> (57: 92.0) (237: 78.0) (238: 116.0) 
240. Mammoth Hot Springs, WY -> (118: 62.0) (241: 124.0) 
241. Cody, WY -> (240: 124.0) (242: 148.0) (243: 214.0) 
242. Sheridan, WY -> (119: 130.0) (120: 200.0) (187: 243.0) (241: 148.0) (243: 147.0) 
243. Casper, WY -> (55: 371.0) (65: 558.0) (122: 400.0) (187: 254.0) (241: 214.0) (242: 147.0) (244: 117.0) (245: 179.0) 
244. Rawlins, WY -> (29: 118.0) (30: 230.0) (55: 401.0) (56: 466.0) (217: 291.0) (243: 117.0) (245: 149.0) 
245. Cheyenne, WY -> (30: 87.0) (31: 101.0) (122: 220.0) (187: 308.0) (243: 179.0) (244: 149.0) 
246. Washington, DC -> (88: 40.0) (162: 417.0) (180: 244.0) (181: 120.0) (224: 247.0) (225: 107.0) (233: 362.0) 
247. Scranton, PA -> (144: 279.0) (145: 130.0) (147: 180.0) (148: 120.0) (181: 124.0) (182: 124.0) 

**** DISTANCE FROM Chicago, IL TO EACH OTHER CITY ****
0. Chicago, IL to Huntsville, AL: 607.0
1. Chicago, IL to Birmingham, AL: 707.0
2. Chicago, IL to Montgomery, AL: 798.0
3. Chicago, IL to Mobile, AL: 885.0
4. Chicago, IL to Grand Canyon, AZ: 1675.0
5. Chicago, IL to Page, AZ: 1704.0
6. Chicago, IL to Williams, AZ: 1667.0
7. Chicago, IL to Flagstaff, AZ: 1632.0
8. Chicago, IL to Phoenix, AZ: 1763.0
9. Chicago, IL to Tucson, AZ: 1745.0
10. Chicago, IL to Nogales, AZ: 1811.0
11. Chicago, IL to Ft Smith, AR: 802.0
12. Chicago, IL to Little Rock, AR: 645.0
13. Chicago, IL to Texarkana, AR: 788.0
14. Chicago, IL to Lake Village, AR: 711.0
15. Chicago, IL to Eureka, CA: 2285.0
16. Chicago, IL to Redding, CA: 2138.0
17. Chicago, IL to San Francisco, CA: 2158.0
18. Chicago, IL to Sacramento, CA: 2071.0
19. Chicago, IL to Yosemite, CA: 2083.0
20. Chicago, IL to Fresno, CA: 2177.0
21. Chicago, IL to Bishop, CA: 1944.0
22. Chicago, IL to San Luis Obispo, CA: 2287.0
23. Chicago, IL to Bakersfield, CA: 2114.0
24. Chicago, IL to Barstow, CA: 1985.0
25. Chicago, IL to Los Angeles, CA: 2099.0
26. Chicago, IL to Needles, CA: 1842.0
27. Chicago, IL to Blythe, CA: 1913.0
28. Chicago, IL to San Diego, CA: 2120.0
29. Chicago, IL to Craig, CO: 1230.0
30. Chicago, IL to Estes Park, CO: 1067.0
31. Chicago, IL to Denver, CO: 1023.0
32. Chicago, IL to Grand Junction, CO: 1267.0
33. Chicago, IL to Kit Carson, CO: 966.0
34. Chicago, IL to Pueblo, CO: 1097.0
35. Chicago, IL to Durango, CO: 1359.0
36. Chicago, IL to Hartford, CT: 930.0
37. Chicago, IL to Newport, RI: 994.0
38. Chicago, IL to Tallahassee, FL: 998.0
39. Chicago, IL to Jacksonville, FL: 1072.0
40. Chicago, IL to Gainesville, FL: 1057.0
41. Chicago, IL to Daytona Beach, FL: 1165.0
42. Chicago, IL to Orlando, FL: 1171.0
43. Chicago, IL to Cocoa, FL: 1220.0
44. Chicago, IL to Tampa, FL: 1189.0
45. Chicago, IL to Vero Beach, FL: 1282.0
46. Chicago, IL to Ft Myers, FL: 1315.0
47. Chicago, IL to Miami, FL: 1398.0
48. Chicago, IL to Key West, FL: 1555.0
49. Chicago, IL to Atlanta, GA: 726.0
50. Chicago, IL to Augusta, GA: 853.0
51. Chicago, IL to Savannah, GA: 974.0
52. Chicago, IL to Tifton, GA: 906.0
53. Chicago, IL to Bonners Ferry, ID: 1752.0
54. Chicago, IL to Boise, ID: 1692.0
55. Chicago, IL to Idaho Falls, ID: 1413.0
56. Chicago, IL to Twin Falls, ID: 1573.0
57. Chicago, IL to Chicago, IL: 0.0
58. Chicago, IL to Peoria, IL: 154.0
59. Chicago, IL to Springfield, IL: 201.0
60. Chicago, IL to Cairo, IL: 373.0
61. Chicago, IL to Ft Wayne, IN: 165.0
62. Chicago, IL to Indianapolis, IN: 186.0
63. Chicago, IL to Decorah, IA: 281.0
64. Chicago, IL to Dubuque, IA: 178.0
65. Chicago, IL to Sioux City, IA: 484.0
66. Chicago, IL to Davenport, IA: 174.0
67. Chicago, IL to Des Moines, IA: 339.0
68. Chicago, IL to Oakley, KS: 855.0
69. Chicago, IL to Hays, KS: 792.0
70. Chicago, IL to Salina, KS: 694.0
71. Chicago, IL to Great Bend, KS: 776.0
72. Chicago, IL to Dodge City, KS: 861.0
73. Chicago, IL to Wichita, KS: 718.0
74. Chicago, IL to Ft Scott, KS: 605.0
75. Chicago, IL to Louisville, KY: 300.0
76. Chicago, IL to Lexington, KY: 379.0
77. Chicago, IL to Park City, KY: 390.0
78. Chicago, IL to Shreveport, LA: 857.0
79. Chicago, IL to Alexandria, LA: 890.0
80. Chicago, IL to Lake Charles, LA: 987.0
81. Chicago, IL to Baton Rouge, LA: 1006.0
82. Chicago, IL to New Orleans, LA: 934.0
83. Chicago, IL to Houlton, ME: 1354.0
84. Chicago, IL to Bangor, ME: 1236.0
85. Chicago, IL to Hulls Cove, ME: 1277.0
86. Chicago, IL to Portland, ME: 1106.0
87. Chicago, IL to Calais, ME: 1334.0
88. Chicago, IL to Baltimore, MD: 758.0
89. Chicago, IL to Boston, MA: 1017.0
90. Chicago, IL to Marquette, MI: 385.0
91. Chicago, IL to Escanaba, MI: 318.0
92. Chicago, IL to Sault Ste Marie, MI: 477.0
93. Chicago, IL to Mackinaw City, MI: 420.0
94. Chicago, IL to Saginaw, MI: 384.0
95. Chicago, IL to Detroit, MI: 282.0
96. Chicago, IL to Grand Rapids, MI: 179.0
97. Chicago, IL to International Falls, MN: 646.0
98. Chicago, IL to Duluth, MN: 482.0
99. Chicago, IL to Minneapolis, MN: 418.0
100. Chicago, IL to Albert Lea, MN: 416.0
101. Chicago, IL to Corinth, MS: 542.0
102. Chicago, IL to Columbus, MS: 661.0
103. Chicago, IL to Meridian, MS: 751.0
104. Chicago, IL to Jackson, MS: 749.0
105. Chicago, IL to St Joseph, MO: 503.0
106. Chicago, IL to Hannibal, MO: 310.0
107. Chicago, IL to Kansas City, MO: 519.0
108. Chicago, IL to Jefferson City, MO: 431.0
109. Chicago, IL to St Louis, MO: 302.0
110. Chicago, IL to Springfield, MO: 518.0
111. Chicago, IL to Poplar Bluff, MO: 450.0
112. Chicago, IL to West Glacier, MT: 1577.0
113. Chicago, IL to Missoula, MT: 1596.0
114. Chicago, IL to Havre, MT: 1348.0
115. Chicago, IL to Great Falls, MT: 1392.0
116. Chicago, IL to Helena, MT: 1482.0
117. Chicago, IL to Butte, MT: 1490.0
118. Chicago, IL to Livingston, MT: 1381.0
119. Chicago, IL to Billings, MT: 1264.0
120. Chicago, IL to Miles City, MT: 1119.0
121. Chicago, IL to Yuma, AZ: 1947.0
122. Chicago, IL to North Platte, NE: 760.0
123. Chicago, IL to Kearney, NE: 661.0
124. Chicago, IL to Grand Island, NE: 668.0
125. Chicago, IL to Lincoln, NE: 532.0
126. Chicago, IL to Omaha, NE: 474.0
127. Chicago, IL to Winnemucca, NV: 1774.0
128. Chicago, IL to Wells, NV: 1600.0
129. Chicago, IL to Reno, NV: 1939.0
130. Chicago, IL to Ely, NV: 1661.0
131. Chicago, IL to Las Vegas, NV: 1828.0
132. Chicago, IL to Concord, NH: 997.0
133. Chicago, IL to Atlantic City, NJ: 848.0
134. Chicago, IL to Gallup, NM: 1447.0
135. Chicago, IL to Santa Fe, NM: 1303.0
136. Chicago, IL to Raton, NM: 1156.0
137. Chicago, IL to Tucumcari, NM: 1134.0
138. Chicago, IL to Clovis, NM: 1169.0
139. Chicago, IL to Albuquerque, NM: 1309.0
140. Chicago, IL to Socorro, NM: 1385.0
141. Chicago, IL to Roswell, NM: 1279.0
142. Chicago, IL to Lordsburg, NM: 1589.0
143. Chicago, IL to Carlsbad, NM: 1355.0
144. Chicago, IL to Buffalo, NY: 553.0
145. Chicago, IL to Syracuse, NY: 703.0
146. Chicago, IL to Watertown, NY: 765.0
147. Chicago, IL to Albany, NY: 848.0
148. Chicago, IL to New York, NY: 812.0
149. Chicago, IL to Asheville, NC: 665.0
150. Chicago, IL to Greensboro, NC: 777.0
151. Chicago, IL to Raleigh, NC: 853.0
152. Chicago, IL to Charlotte, NC: 794.0
153. Chicago, IL to Wilmington, NC: 984.0
154. Chicago, IL to Williston, ND: 1046.0
155. Chicago, IL to Minot, ND: 921.0
156. Chicago, IL to Grand Forks, ND: 733.0
157. Chicago, IL to Fargo, ND: 652.0
158. Chicago, IL to Bismarck, ND: 848.0
159. Chicago, IL to Toledo, OH: 245.0
160. Chicago, IL to Cleveland, OH: 360.0
161. Chicago, IL to Youngstown, OH: 417.0
162. Chicago, IL to Columbus, OH: 337.0
163. Chicago, IL to Cincinnati, OH: 298.0
164. Chicago, IL to Guymon, OK: 969.0
165. Chicago, IL to Oklahoma City, OK: 806.0
166. Chicago, IL to Tulsa, OK: 700.0
167. Chicago, IL to Atoka, OK: 810.0
168. Chicago, IL to Astoria, OR: 2221.0
169. Chicago, IL to Portland, OR: 2123.0
170. Chicago, IL to Newport, OR: 2257.0
171. Chicago, IL to Coos Bay, OR: 2355.0
172. Chicago, IL to Eugene, OR: 2125.0
173. Chicago, IL to Grants Pass, OR: 2183.0
174. Chicago, IL to Klamath Falls, OR: 2081.0
175. Chicago, IL to Bend, OR: 2010.0
176. Chicago, IL to Biggs, OR: 2020.0
177. Chicago, IL to Pendleton, OR: 1914.0
178. Chicago, IL to Burns, OR: 1880.0
179. Chicago, IL to Lakeview, OR: 1985.0
180. Chicago, IL to Pittsburgh, PA: 480.0
181. Chicago, IL to Harrisburg, PA: 680.0
182. Chicago, IL to Philadelphia, PA: 786.0
183. Chicago, IL to Columbia, SC: 822.0
184. Chicago, IL to Florence, SC: 903.0
185. Chicago, IL to Myrtle Beach, SC: 970.0
186. Chicago, IL to Charleston, SC: 934.0
187. Chicago, IL to Rapid City, SD: 912.0
188. Chicago, IL to Pierre, SD: 792.0
189. Chicago, IL to Aberdeen, SD: 731.0
190. Chicago, IL to Watertown, SD: 627.0
191. Chicago, IL to Sioux Falls, SD: 568.0
192. Chicago, IL to Memphis, TN: 540.0
193. Chicago, IL to Nashville, TN: 476.0
194. Chicago, IL to Chattanooga, TN: 608.0
195. Chicago, IL to Knoxville, TN: 549.0
196. Chicago, IL to El Paso, TX: 1484.0
197. Chicago, IL to Ft Stockton, TX: 1363.0
198. Chicago, IL to Marathon, TX: 1421.0
199. Chicago, IL to Odessa, TX: 1289.0
200. Chicago, IL to Lubbock, TX: 1149.0
201. Chicago, IL to Amarillo, TX: 1064.0
202. Chicago, IL to Vernon, TX: 970.0
203. Chicago, IL to Snyder, TX: 1197.0
204. Chicago, IL to San Angelo, TX: 1201.0
205. Chicago, IL to Del Rio, TX: 1357.0
206. Chicago, IL to Cisco, TX: 1072.0
207. Chicago, IL to Brownwood, TX: 1105.0
208. Chicago, IL to Ft Worth, TX: 967.0
209. Chicago, IL to Dallas, TX: 935.0
210. Chicago, IL to Austin, TX: 1130.0
211. Chicago, IL to San Antonio, TX: 1210.0
212. Chicago, IL to Laredo, TX: 1364.0
213. Chicago, IL to Brownsville, TX: 1472.0
214. Chicago, IL to Corpus Christi, TX: 1308.0
215. Chicago, IL to Victoria, TX: 1212.0
216. Chicago, IL to Houston, TX: 1085.0
217. Chicago, IL to Salt Lake City, UT: 1420.0
218. Chicago, IL to Spanish Fork, UT: 1473.0
219. Chicago, IL to St George, UT: 1708.0
220. Chicago, IL to Springdale, UT: 1663.0
221. Chicago, IL to Salina, UT: 1475.0
222. Chicago, IL to Green River, UT: 1368.0
223. Chicago, IL to Burlington, VT: 1000.0
224. Chicago, IL to Roanoke, VA: 678.0
225. Chicago, IL to Richmond, VA: 814.0
226. Chicago, IL to Norfolk, VA: 906.0
227. Chicago, IL to Port Angeles, WA: 2156.0
228. Chicago, IL to Everett, WA: 2085.0
229. Chicago, IL to Seattle, WA: 2073.0
230. Chicago, IL to Ellensburg, WA: 1966.0
231. Chicago, IL to Wenatchee, WA: 1962.0
232. Chicago, IL to Spokane, WA: 1793.0
233. Chicago, IL to Charleston, WV: 496.0
234. Chicago, IL to Bluefield, WV: 604.0
235. Chicago, IL to Eau Claire, WI: 327.0
236. Chicago, IL to La Crosse, WI: 291.0
237. Chicago, IL to Madison, WI: 146.0
238. Chicago, IL to Green Bay, WI: 208.0
239. Chicago, IL to Milwaukee, WI: 92.0
240. Chicago, IL to Mammoth Hot Springs, WY: 1380.0
241. Chicago, IL to Cody, WY: 1256.0
242. Chicago, IL to Sheridan, WY: 1155.0
243. Chicago, IL to Casper, WY: 1042.0
244. Chicago, IL to Rawlins, WY: 1129.0
245. Chicago, IL to Cheyenne, WY: 980.0
246. Chicago, IL to Washington, DC: 724.0
247. Chicago, IL to Scranton, PA: 804.0

**** FINDING CITY TO TRAVEL TO FOR ALL PARTICIPANTS ****
City to travel to:		Indianapolis, IN
Total Average Distance:	881.8823
