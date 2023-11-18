package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName: String = "Messy"
    val lastName: String = "Wirdianti"
    val age: Number = 20
    val status: Boolean = true

    println("Nama Depan: $firstName")
    println("Nama Belakang: $lastName")
    println("Umur: $age tahun")
    println("Status: ${if (status) "Single" else "tidak"}")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    val groupId = "Kuda Terbang"
    val groupMember = listOf("Messy Wirdianti", "oktariza dwi putri", "elrida eldaa","reza yahya pahlevi","galung wendi","andre","kukuh","hary")
    val session = "Afternoon"

    println("Grup ID = $groupId")
    println("Group Member = $groupMember")
    println("Session = $session")
    return "Unit"
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val groupMember = listOf("oktariza dwi putri", "elrida eldaa","reza yahya pahlevi","Messy Wirdianti")
    val myName = groupMember [3]
    println("Nama Saya : $myName")
    return groupMember
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Malik","Reynaldi")
    val countOfGroup = arrayOf<String>("Messy Wirdianti", "oktariza dwi putri", "elrida eldaa","reza yahya pahlevi","galung wendi","andre","kukuh","hary")
    val total = mentor.size + countOfGroup.size
    return total
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("", listOf(), "")

}