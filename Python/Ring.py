import math


class Circle:
    def __init__(self, radius):
        self.radius = radius

    @staticmethod
    def calculate_area(r):
        return math.pi * math.pow(r, 2)


class Ring(Circle):
    def __init__(self, radius_internal, radius_external):
        Circle.__init__(self, radius_internal)
        self.radius_external = radius_external

    def calculate_ring_area(self):
        return self.calculate_area(self.radius_external) - self.calculate_area(self.radius)


def main():
    __external = input("Radius value of the largest circumference: ")
    __internal = input("Radius value of the smallest circumference: ")
    print "area = ", Ring(__internal, __external).calculate_ring_area()


main()
