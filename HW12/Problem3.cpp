#include <iostream>
#include <cmath>
using namespace std;

double calculateDistance(double startX, double startY, double endX, double endY) {
    return sqrt((endX - startX) * (endX - startX) + (endY - startY) * (endY - startY));
}

int main() {
    int numberOfSides;
    cout << "Enter the number of sides: ";
    cin >> numberOfSides;

    if (numberOfSides < 3) {
        cout << "A polygon must have at least 3 sides." << endl;
        return 1;
    }

    double firstX, firstY, currentX, currentY, nextX, nextY;
    double totalPerimeter = 0.0;

    cout << "Enter coordinates of vertex 1 (x y): ";
    cin >> firstX >> firstY;
    currentX = firstX;
    currentY = firstY;

    for (int i = 2; i <= numberOfSides; i++) {
        cout << "Enter coordinates of vertex " << i << " (x y): ";
        cin >> nextX >> nextY;
        totalPerimeter += calculateDistance(currentX, currentY, nextX, nextY);
        currentX = nextX;
        currentY = nextY;
    }

    totalPerimeter += calculateDistance(currentX, currentY, firstX, firstY);

    cout << "Perimeter: " << totalPerimeter << endl;

    return 0;
}
