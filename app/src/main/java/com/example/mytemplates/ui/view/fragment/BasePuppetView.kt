//package qbt.lepta.presentation.ui.core.view.fragment
//
//import androidx.lifecycle.ViewModelProvider
//import android.content.Context
//import com.codeerow.pandora.box.mvvm.core.state.State
//import com.codeerow.pandora.box.mvvm.view.MvvmActivity
//import com.codeerow.pandora.box.mvvm.view.PuppetView
//import com.codeerow.pandora.box.mvvm.view.ViewPresentation
//import dagger.android.support.AndroidSupportInjection
//import javax.inject.Inject
//
//
//abstract class BasePuppetView<T : ViewPresentation> : PuppetView<T>() {
//
//    @Inject
//    override lateinit var viewModelFactory: ViewModelProvider.Factory
//
//
//    /* Lifecycle methods */
//    override fun onAttach(context: Context) {
//        // This is called even for API levels below 23.
//        AndroidSupportInjection.inject(this)
//        super.onAttach(context)
//    }
//
//
//    /**
//     * Dispatching rendering ViewState on activity in case of
//     * common ViewState.
//     * */
//    override fun render(viewState: State) {
//        (requireActivity() as? MvvmActivity<*>)?.render(viewState)
//    }
//}