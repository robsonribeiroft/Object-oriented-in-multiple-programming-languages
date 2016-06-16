#include <iostream>
#include <cmath>

using namespace std;

class Circle {

protected:
    double radius;
public:
        Circle(double radius){
            this->radius = radius;
        }

    double getCircleArea(double radius){
        return 3.141592653589793 * pow(radius, 2);
    }
};


class Ring : public Circle{

    double radiusInternal;

public:
    Ring(double radius, double radiusInt) : Circle(radius) {
        this->radiusInternal = radiusInt;
    }

    double getRingArea(){
        return this->getCircleArea(this->radius) - this->getCircleArea(this->radiusInternal);
    }
};

int main() {
    double radiusExternal, radiusInternal;

    cout << "Value of the external radius: ";

    cin >> radiusExternal;
    cout << "Value of the internal radius: ";
    cin >> radiusInternal;

    cout << "The ring size is: " << fixed << Ring(radiusExternal, radiusInternal).getRingArea() << endl;
    return 0;
}