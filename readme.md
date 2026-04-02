# 📱 Appium Mobile Automation Framework

Automation testing framework untuk aplikasi Android menggunakan Appium, TestNG, dan ExtentReports. Framework ini dirancang untuk scalable testing, mendukung parallel execution (multi-device), serta terintegrasi dengan CI/CD.

---

## 🚀 Tech Stack

* **Language**: Java
* **Automation**: Appium
* **Test Framework**: TestNG
* **Build Tool**: Gradle
* **Reporting**: ExtentReports
* **CI/CD**: GitHub Actions

---

## 📂 Project Structure

```
├── apk/                    # File APK aplikasi
├── chromedriver/          # Chromedriver untuk webview (jika ada)
├── reports/               # Hasil report & screenshot
│   └── screenshots/
├── src/
│   └── test/java/
│      └── saucedemo/
│          ├── core/      # DriverManager, BaseTest, Listener
│          ├── pages/     # Page Object Model
│          └── tests/     # Test Case
└── build.gradle
```

---

## ⚙️ Features

* ✅ Page Object Model (POM)
* ✅ Thread-safe Driver (ThreadLocal)
* ✅ Screenshot otomatis saat test gagal
* ✅ HTML Report (ExtentReports)
* ✅ Parallel execution (multi-device)
* ✅ CI/CD integration (GitHub Actions)
* ✅ Configurable device capability

---

## ▶️ How to Run Test

### 1. Start Appium Server

```
appium
```

### 2. Jalankan Emulator / Hubungkan Device

```
adb devices
```

### 3. Run Test

```
./gradlew clean test
```

---

## 📊 Report

Setelah test selesai, report tersedia di:

```
/reports/extent-report_*.html
```

Screenshot otomatis tersimpan di:

```
/reports/screenshots/
```


---

## 🔄 CI/CD Integration

Workflow menggunakan GitHub Actions dengan self-hosted runner.

Trigger:

* Push ke branch `main`

Pipeline:

1. Checkout repository
2. Setup environment
3. Run automation test

---

## 🎥 Demo Test Execution
[Watch Video](https://drive.google.com/file/d/1j-1g65aMBgisLu8i7Kgimu0ja6qyaj16/view?usp=sharing)

---

## ⚠️ Requirements

* Java 17
* Node.js & Appium
* Android SDK
* Emulator / Real Device
* Appium Server running

---

## 🧠 Design Approach

Framework ini dirancang dengan prinsip:

* **Test Independence** → setiap test berjalan di session sendiri
* **Scalability** → mudah ditambah device / test
* **Maintainability** → menggunakan Page Object Model
* **Observability** → report + screenshot untuk debugging

---

## 📌 Future Improvements

* [ ] Auto-detect connected devices (ADB)
* [ ] Dynamic capability configuration
* [ ] Parallel execution via CI matrix
* [ ] Video recording test execution
* [ ] Integration with Allure Report

---

## 👤 Author

**Reza Fahmi**
QA Automation Engineer (Aspiring)

---

## ⭐ Notes

Project ini dibuat sebagai bagian dari pengembangan skill QA Automation, khususnya dalam mobile testing menggunakan Appium.

---
