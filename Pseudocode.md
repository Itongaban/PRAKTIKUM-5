BEGIN

    INPUT namaBarang
    INPUT hargaSatuan
    INPUT jumlah

    subtotal ← hargaSatuan × jumlah
    pajak ← subtotal × 0.11
    total ← subtotal + pajak

    OUTPUT namaBarang
    OUTPUT subtotal
    OUTPUT pajak
    OUTPUT total

END
