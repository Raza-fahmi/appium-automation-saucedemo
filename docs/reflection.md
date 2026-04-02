# 📘 Reflection Answers

## 1. Critical Path Automation

Dari seluruh rangkaian automation test yang dibuat, skenario yang paling kritikal adalah proses login, add to cart, sampai dengan checkout sebagai satu alur end-to-end.

Proses login menjadi sangat penting karena merupakan pintu utama bagi pengguna untuk mengakses aplikasi. Jika proses login gagal, maka seluruh fitur lain tidak dapat digunakan dan automation test berikutnya menjadi tidak relevan untuk dijalankan.

Selain itu, proses add to cart dan checkout juga merupakan bagian inti dari fungsi bisnis aplikasi, khususnya pada aplikasi e-commerce. Fitur ini secara langsung berkaitan dengan tujuan utama pengguna, yaitu memilih dan membeli produk.

Dengan menggabungkan proses tersebut menjadi satu alur end-to-end, automation test dapat memastikan bahwa:

* pengguna dapat masuk ke dalam aplikasi dengan kredensial yang valid
* pengguna dapat berinteraksi dengan produk
* pengguna dapat menambahkan produk ke dalam cart
* pengguna dapat melakukan pembelian produk yang diinginkan

Jika salah satu dari skenario ini gagal, maka risiko yang dapat terjadi antara lain:

* pengguna tidak dapat mengakses aplikasi (jika login gagal)
* pengguna tidak dapat melakukan transaksi (jika add to cart dan checkout gagal)
* alur utama aplikasi menjadi tidak berjalan dengan baik

Oleh karena itu, kedua skenario ini termasuk dalam critical path karena mewakili alur utama yang paling penting dalam aplikasi.

---

## 2. Locator & Stabilitas Testing

Saat menggunakan Appium Inspector untuk mengambil locator, terdapat beberapa kendala yang ditemukan, terutama pada elemen yang tidak memiliki atribut yang konsisten atau unik.

Beberapa elemen hanya dapat diakses menggunakan XPath yang cukup panjang dan bergantung pada struktur UI. Hal ini berisiko karena XPath cenderung mudah berubah jika terjadi perubahan kecil pada layout aplikasi.

Dalam menentukan locator, pendekatan yang digunakan adalah memprioritaskan locator yang paling stabil, yaitu:

* menggunakan id jika tersedia, karena biasanya bersifat unik dan tidak mudah berubah
* menggunakan accessibility id karena lebih mudah dibaca dan maintainable
* menggunakan XPath sebagai pilihan terakhir jika tidak ada opsi lain

Pemilihan locator sangat mempengaruhi stabilitas automation test. Locator yang tidak stabil dapat menyebabkan test menjadi flaky, yaitu kondisi di mana test kadang berhasil dan kadang gagal tanpa adanya perubahan pada aplikasi.

Hal ini dapat menurunkan kepercayaan terhadap hasil automation, karena sulit membedakan apakah kegagalan berasal dari bug aplikasi atau dari test itu sendiri.

Oleh karena itu, penting untuk memilih locator yang tepat agar automation test tetap reliable, mudah dipelihara, dan tidak mudah rusak ketika terjadi perubahan pada aplikasi.
