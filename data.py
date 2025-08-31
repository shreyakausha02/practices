import pandas as pd

import matplotlib.pyplot as plt
info = {
       'food' : ['meat','Banana','Avacadoes','Potato','Spinach','Watermelon','Coconut water','Beans','Legumes','Tomato'],
       'calories' : ['250','130''140','120','20','20','10','50','40','19'],
       'Potassium' : ['40','55','20','30','40','32','10','26','25','20'],
       'fat' : ['8','5','3','6','1','1.5','0','2','1.5','2.5']
       }
df = pd.DataFrame(info)
print(df)

df.plt(x='food',y='calories',figsize=(10,6))


plt.show()
