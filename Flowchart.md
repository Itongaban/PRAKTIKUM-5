### Flowchart

```mermaid
flowchart TD
         A([Mulai]) 
    [/Input namaBarang,harga satuan,jumlah/]
    E --> F[ subtotal = hargaSatuan × jumlah]
    F --> G[ pajak = subtotal × PPN]
    G --> H[ total = subtotal + pajak]
    H --> I[/Tampilkan Output Barang, Subtotal, PPN, dan Total/]
    I --> J([Selesai])
```
