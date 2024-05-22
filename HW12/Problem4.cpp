#include <iostream>
#include <vector>
#include <cmath>

int main() {
    Polynomial p1({1, 3, 5});
    Polynomial p2({2, 4});

    Polynomial result = p1 + p2;
    std::cout << "The value of the resulting polynomial at x=22 is " << result.evaluate(22) << std::endl;

    return 0;
}

class Polynomial {
private:
    std::vector<double> coeffs;

public:
    Polynomial(const std::vector<double>& coefficients) : coeffs(coefficients) {}

    ~Polynomial() {}

    double getCoefficient(int index) const {
        if (index < 0 || index >= coeffs.size()) {
            return 0;
        }
        return coeffs[index];
    }

    void setCoefficient(int index, double value) {
        if (index >= 0 && index < coeffs.size()) {
            coeffs[index] = value;
        }
    }

    double evaluate(double x) const {
        double result = 0.0;
        for (int i = 0; i < coeffs.size(); i++) {
            result += coeffs[i] * pow(x, i);
        }
        return result;
    }

    Polynomial operator+(const Polynomial& rhs) const {
        int max_size = std::max(coeffs.size(), rhs.coeffs.size());
        std::vector<double> result_coeffs(max_size, 0);

        for (int i = 0; i < max_size; i++) {
            double c1 = i < coeffs.size() ? coeffs[i] : 0;
            double c2 = i < rhs.coeffs.size() ? rhs.coeffs[i] : 0;
            result_coeffs[i] = c1 + c2;
        }
        return Polynomial(result_coeffs);
    }

    Polynomial operator-(const Polynomial& rhs) const {
        int max_size = std::max(coeffs.size(), rhs.coeffs.size());
        std::vector<double> result_coeffs(max_size, 0);

        for (int i = 0; i < max_size; i++) {
            double c1 = i < coeffs.size() ? coeffs[i] : 0;
            double c2 = i < rhs.coeffs.size() ? rhs.coeffs[i] : 0;
            result_coeffs[i] = c1 - c2;
        }
        return Polynomial(result_coeffs);
    }

    Polynomial& operator=(const Polynomial& rhs) {
        if (this != &rhs) {
            coeffs = rhs.coeffs;
        }
        return *this;
    }

    Polynomial operator*(const Polynomial& rhs) const {
        int new_size = coeffs.size() + rhs.coeffs.size() - 1;
        std::vector<double> result_coeffs(new_size, 0);

        for (int i = 0; i < coeffs.size(); i++) {
            for (int j = 0; j < rhs.coeffs.size(); j++) {
                result_coeffs[i + j] += coeffs[i] * rhs.coeffs[j];
            }
        }
        return Polynomial(result_coeffs);
    }
};
