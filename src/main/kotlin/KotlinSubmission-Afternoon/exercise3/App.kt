package id.infinitelearning.KotlinSubmission.exercise3



    /** Latihan 1
    Buatlah logika if untuk mengevaluasi nilai score dengan ketentuan:
    1. Jika nilai score lebih atau sama dengan 90
    - Isi variabel result dengan nilai: 'Selamat! Anda mendapatkan nilai A.'
    2. Jika nilai score ada di antara 80 hingga 89
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai B.'
    3. Jika nilai score ada di antara 70 hingga 79
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai C.'
    4. Jika nilai score ada di antara 60 hingga 69:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai D.'
    5. Jika nilai score di bawah 60:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai E.'
     */
    fun main() {
        val score = 50
        val result = when {
            score >= 90 -> "Selamat! Anda Mendapatkan Nilai A."
            score in 80..89 -> "Anda Mendapat Nilai B."
            score in 70..79 -> "Anda Mendapat Nilai C."
            score in 60..68 -> "Anda Mandapat Nilai D."
            score < 60 -> "Anda Mendapatkan Nilai E."
            else -> {}
        }
        println(result)
}