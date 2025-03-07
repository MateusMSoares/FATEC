import numpy as np
import matplotlib.pyplot as plt

def mandelbrot(c, max_iter):
    z = 0
    n = 0
    while abs(z) <= 2 and n < max_iter:
        z = ((z*z) * 2) + c
        n += 1
    return n

def mandelbrot_set(xmin, xmax, ymin, ymax, width, height, max_iter):
    x = np.linspace(xmin, xmax, width)
    y = np.linspace(ymin, ymax, height)
    img = np.empty((width, height))

    for i in range(width):
        for j in range(height):
            cx, cy = x[i], y[j]
            img[i, j] = mandelbrot(complex(cx, cy), max_iter)

    return img

# Define the parameters for the Mandelbrot set
xmin, xmax = -2.0, 1.0
ymin, ymax = -1.5, 1.5
width, height = 800, 800
max_iter = 254

# Generate the Mandelbrot set
mandelbrot_image = mandelbrot_set(xmin, xmax, ymin, ymax, width, height, max_iter)

# Display the Mandelbrot set
plt.imshow(mandelbrot_image.T, extent=(xmin, xmax, ymin, ymax), cmap='hot', origin='lower')
plt.colorbar()
plt.title("Mandelbrot Set")
plt.xlabel("Real")
plt.ylabel("Imaginary")
plt.show()
