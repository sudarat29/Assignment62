package com.example.assignment6_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

var t1 = "t1"
var result = "result"
var pic = "pic"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView5.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(t1,"FARM LUCK")
            intent.putExtra(pic,R.drawable.s1)
            intent.putExtra(result,"เป็นร้านเล็กๆ ที่มีอาหารเครื่องดื่มให้เลือกหลากหลาย รสชาติดีและราคาไม่แพงอีกด้วย เป็นคาเฟ่ และร้านอาหารคุณภาพกลางๆ ที่กินได้ทั้งครอบครัว\n" +
                    "\n" +
                    "เมนูแนะนำ : สเต๊กหมูจิ้มเเจ่ว\n" +
                    "\n" +
                    "พิกัด : ถนนพุทธบูชา แขวงบางมด เขตทุ่งครุ กรุงเทพมหานคร\n" +
                    "\n" +
                    "เวลาเปิด-ปิด : ทุกวัน เวลา 11.00-22.00  น.")
            startActivity(intent)
        }
        textView6.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(t1,"ร้าน เจ๊เล้ง ครัวส้มตำไก่ย่าง")
            intent.putExtra(pic,R.drawable.s2)
            intent.putExtra(result,"Facebook : เจ๊เล้ง ครัวส้มตำไก่ย่าง\n" +
                    "ที่อยู่ : 298/2 ซอยพุทธบูชา 36 ถนนพุทธบูชา (ตรงข้ามซอย 39 ปากทางออกวัดหลวงพ่อโอภาสี) บางมด , ทุ่งครุ , กรุงเทพมหานคร 10140\n" +
                    "\n" +
                    "เบอร์โทร : 02 – 426 – 3707 , 02 – 874 – 8357 , 087 – 006 – 9824\n" +
                    "\n" +
                    "เวลาเปิด – ปิดบริการ : เปิดบริการทุกวัน 9.00 – 20.00 น.")
            startActivity(intent)
        }
        textView7.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(t1,"Scenery Kaffe&Restaurant")
            intent.putExtra(pic,R.drawable.s3)
            intent.putExtra(result,"ภายในร้านบรรยากาศดี ร่มรื่น วิวสวย อาหารอร่อย เป็นร้านอาหารตกแต่งสไตล์สวนสำหรับคู่รักที่มาใช้ถ่ายรูปพรีเวดดิ้ง\n" +
                    "\n" +
                    "เมนูแนะนำ : ไก่อบครีมมะนาว\n" +
                    "\n" +
                    "พิกัด : ถนนพุทธบูชา แขวงบางมด เขตทุ่งครุ กรุงเทพมหานคร\n" +
                    "\n" +
                    "เวลาเปิด-ปิด : ทุกวัน 11.00-14.00 , 16.00-20.30 น.")
            startActivity(intent)
        }
        textView8.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(t1,"BangMod Pizzeria")
            intent.putExtra(pic,R.drawable.s4)
            intent.putExtra(result,"ตั้งอยู่ในอาคารพานิชย์ ด้านหลังสวนหมาก ซึ่งอยู่บนถนนพุทธบูชา บรรยากาศดี อาหารอร่อย ราคาไม่แพง อยากให้ทุกคนได้มาลองรับรองว่าไม่ผิดหวังแน่นอน\n" +
                    "\n" +
                    "เมนูแนะนำ : สปาเก็ตตี้ขี้เมาทะเล\n" +
                    "\n" +
                    "พิกัด : ถนนพุทธบูชา แขวงบางมด เขตทุ่งครุ กรุงเทพมหานคร\n" +
                    "\n" +
                    "เวลาเปิด-ปิด : ทุกวัน ยกเว้นวันพุธ เวลา 12.00-21.00 น.")
            startActivity(intent)
        }
        textView9.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(t1,"เก๋าใหญ่ ซีฟู๊ด")
            intent.putExtra(pic,R.drawable.s5)
            intent.putExtra(result,"Facebook : เก๋าใหญ่ซีฟู้ด พุทธบูชา\n" +
                    "ที่อยู่ : 324 ถนน พุทธบูชา แขวง บางมด เขตทุ่งครุ กรุงเทพมหานคร 10140\n" +
                    "\n" +
                    "เบอร์โทร : 02 – 426 – 5220 , 086 – 603 – 0016 , 089 – 111 – 4162\n" +
                    "\n" +
                    "เวลาเปิด – ปิดบริการ : เปิดบริการทุกวัน 15.00 – 23.00 น.")
            startActivity(intent)
        }
    }
}