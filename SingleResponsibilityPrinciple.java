package solid_principles;

// Single Responsibility Principle: One class, one job



// Bad: One class handles too much
class Report {
    void generateReport() { /* ... */ }
    void saveToFile() { /* ... */ }  // violates SRP
}

// Good: Split responsibilities
class ReportGenerator {
    void generate() { /* ... */ }
}

class ReportSaver {
    void save(String report) { /* ... */ }
}