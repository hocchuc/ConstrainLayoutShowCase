package hocchuc.com.constrainlayoutshowcase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import hocchuc.com.constrainlayoutshowcase.R.id.btn1
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpView()

    }

    private fun setUpView() {
        btn1.setOnClickListener({
            startActivity<ExampleOneActivity>()
        })
        btn2.setOnClickListener({
            startActivity<ExampleTwoActivity>()

        })
        btn3.setOnClickListener({
            startActivity<ExampleThreeActivity>()
        })
    }
}
