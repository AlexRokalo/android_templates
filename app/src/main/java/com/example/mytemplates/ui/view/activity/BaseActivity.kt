//package qbt.lepta.presentation.ui.common.base.activity
//
//import android.content.Context
//import android.os.Bundle
//import butterknife.ButterKnife
//import com.codeerow.pandora.box.common.handler.ExceptionHandler
//import com.codeerow.pandora.box.common.handler.LoadingEventHandler
//import com.codeerow.pandora.box.navigation.view.NavAppCompatActivity
//import uk.co.chrisjenx.calligraphy.CalligraphyConfig
//import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper
//
//
//abstract class BaseActivity : NavAppCompatActivity(),
//        LoadingEventHandler, ExceptionHandler {
//
//
//    /* Lifecycle */
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        ButterKnife.bind(this)
//
//        CalligraphyConfig.initDefault(CalligraphyConfig.Builder()
//                .setDefaultFontPath("fonts/meseo_sans_cyrl_500.ttf")
//                .setDefaultFontPath("fonts/meseo_sans_cyrl_700.ttf")
//                .build()
//        )
//    }
//
//    override fun attachBaseContext(newBase: Context) {
//        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase))
//    }
//
//}