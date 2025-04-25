package com.glority.android.picturexx.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.core.os.BundleKt;
import androidx.databinding.ViewDataBinding;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bumptech.glide.Glide;
import com.glority.android.cmsui2.CmsFactory;
import com.glority.android.cmsui2.entity.CmsItemEntity;
import com.glority.android.cmsui2.util.CmsDataUtils;
import com.glority.android.cmsui2.view.BaseCmsItemView;
import com.glority.android.cmsui2.view.CmsView;
import com.glority.android.cmsui2.view.child.WebViewItemView;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.database.DBManager;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.database.entities.SimpleCollectionItem;
import com.glority.android.database.entities.UserSeriesListItem;
import com.glority.android.database.entities.WishItem;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.CmsDetailBottomBar1Binding;
import com.glority.android.picturexx.business.databinding.CmsDetailBottomBar2Binding;
import com.glority.android.picturexx.extensions.CmsNameExtKt;
import com.glority.android.picturexx.js.method.BaseJsMethod;
import com.glority.android.picturexx.js.method.CmsJsMethod;
import com.glority.android.picturexx.recognize.CoreActivity;
import com.glority.android.picturexx.repository.WishRepository;
import com.glority.android.picturexx.utils.CoinConfigUtils;
import com.glority.android.picturexx.utils.PageNameMapUtils;
import com.glority.android.picturexx.view.dialog.AddWishSuccessDialog;
import com.glority.android.picturexx.view.dialog.RemoveWishSuccessDialog;
import com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment;
import com.glority.android.picturexx.vm.CollectionViewModel;
import com.glority.android.picturexx.vm.MainRecognizeProcess;
import com.glority.android.picturexx.widget.NewRecognizeHeaderView;
import com.glority.android.picturexx.widget.RecognizeHeaderView;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.abtest.CoinAbTestUtils;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.share.ShareUtil;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.base.widget.webview.AbsJsMethod;
import com.glority.base.widget.webview.JsbWebView;
import com.glority.base.widget.webview.MediatorJsMethod;
import com.glority.base.widget.webview.entity.MethodInvoke;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsImage;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsStaticUrl;
import com.glority.network.model.Status;
import com.glority.utils.app.ResUtils;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import com.glority.widget.scrollview.GlNestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: BaseCmsDetailFragment.kt */
@Metadata(d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010P\u001a\u00020QH\u0014J\u0012\u0010R\u001a\u00020G2\b\u0010S\u001a\u0004\u0018\u00010TH\u0014J\b\u0010U\u001a\u00020GH\u0016J\b\u0010V\u001a\u00020GH\u0016J\u0018\u0010W\u001a\u00020G2\u0006\u0010X\u001a\u00020I2\u0006\u0010Y\u001a\u00020IH\u0016J(\u0010Z\u001a\u00020G2\u0006\u0010[\u001a\u00020\u001e2\u0006\u0010\\\u001a\u00020Q2\u0006\u0010]\u001a\u00020Q2\u0006\u0010^\u001a\u00020QH\u0016J\b\u0010_\u001a\u00020GH\u0002J\u001a\u0010`\u001a\u00020G2\u0006\u0010a\u001a\u00020\t2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010TJ\b\u0010c\u001a\u00020\tH\u0002J\b\u0010d\u001a\u00020GH&J\b\u0010e\u001a\u00020GH\u0016J\u0016\u0010f\u001a\u0004\u0018\u00010g2\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\tH\u0016J;\u0010i\u001a\u00020G2\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\t2'\b\u0002\u0010j\u001a!\u0012\u0015\u0012\u0013\u0018\u00010g¢\u0006\f\bl\u0012\b\bm\u0012\u0004\b\b(n\u0012\u0004\u0012\u00020G\u0018\u00010kJ\"\u0010o\u001a\u00020G2\u0006\u0010p\u001a\u00020Q2\u0006\u0010q\u001a\u00020Q2\b\u0010r\u001a\u0004\u0018\u00010sH\u0016J\u0010\u0010t\u001a\u00020G2\u0006\u0010u\u001a\u00020\u001eH\u0002J\b\u0010v\u001a\u00020IH\u0002JT\u0010w\u001a\u00020G2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010x\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010y\u001a\u0004\u0018\u00010z2\n\b\u0002\u0010{\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010|\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010}\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016J\u001e\u0010~\u001a\u00020G2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\b\u0010y\u001a\u0004\u0018\u00010zJ\u0011\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001H&¢\u0006\u0003\u0010\u0081\u0001J\t\u0010\u0082\u0001\u001a\u00020\tH\u0014J&\u0010\u0083\u0001\u001a\u00020G2\b\u0010\u0084\u0001\u001a\u00030\u0085\u00012\b\u0010\u0086\u0001\u001a\u00030\u0087\u00012\u0007\u0010\u0088\u0001\u001a\u00020QH\u0004J&\u0010\u0089\u0001\u001a\u00020G2\b\u0010\u0084\u0001\u001a\u00030\u0085\u00012\b\u0010\u0086\u0001\u001a\u00030\u0087\u00012\u0007\u0010\u0088\u0001\u001a\u00020QH\u0004J\t\u0010\u008a\u0001\u001a\u00020IH\u0016J&\u0010\u008b\u0001\u001a\u00020G2\u0007\u0010\u008c\u0001\u001a\u00020I2\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008e\u0001H\u0016J\u0011\u0010\u008f\u0001\u001a\u00020G2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\t\u0010\u0090\u0001\u001a\u00020IH\u0016J\u0011\u0010\u0091\u0001\u001a\u00020G2\u0006\u0010<\u001a\u00020\tH\u0016J\t\u0010\u0092\u0001\u001a\u00020IH\u0016J\u000b\u0010\u0093\u0001\u001a\u0004\u0018\u00010\tH\u0016J\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010\tJ\u001f\u0010\u0095\u0001\u001a\u00020G2\b\u0010\u0096\u0001\u001a\u00030\u0097\u00012\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u0001H\u0016J\u0010\u0010\u009a\u0001\u001a\t\u0012\u0005\u0012\u00030\u009b\u00010\bH\u0016J+\u0010\u009c\u0001\u001a\u00020G2\"\u0010j\u001a\u001e\u0012\u0014\u0012\u00120I¢\u0006\r\bl\u0012\t\bm\u0012\u0005\b\b(\u009d\u0001\u0012\u0004\u0012\u00020G0kJ\u0017\u0010\u009e\u0001\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0007\u0012\u0005\u0018\u00010 \u00010\u009f\u0001J\t\u0010¡\u0001\u001a\u00020\tH\u0002J\u0019\u0010¢\u0001\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0007\u0012\u0005\u0018\u00010 \u00010\u009f\u0001H\u0016J\t\u0010£\u0001\u001a\u00020QH\u0016J)\u0010¤\u0001\u001a\u00020G2\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010{\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010|\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010H\u001a\u00020IH\u0016J%\u0010¥\u0001\u001a\u00020G2\b\u0010<\u001a\u0004\u0018\u00010\t2\b\u00104\u001a\u0004\u0018\u00010\t2\b\u00109\u001a\u0004\u0018\u00010\tJ4\u0010¦\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030 \u00010§\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\u0010¨\u0001\u001a\u0005\u0018\u00010©\u00012\u0007\u0010ª\u0001\u001a\u00020IJ\u001e\u0010«\u0001\u001a\u00020G2\b\u0010¬\u0001\u001a\u00030\u00ad\u00012\t\u0010®\u0001\u001a\u0004\u0018\u00010\tH\u0016J\t\u0010¯\u0001\u001a\u00020GH\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010&\u001a\u00020'8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0-X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u00104\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u00109\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u00106\"\u0004\b;\u00108R\u001c\u0010<\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00106\"\u0004\b>\u00108R\u001c\u0010?\u001a\u0004\u0018\u00010@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010E\u001a\b\u0012\u0004\u0012\u00020G0FX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020IX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010J\u001a\u0004\u0018\u00010KX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010L\u001a\u0004\u0018\u00010MX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010N\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010O\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006°\u0001"}, d2 = {"Lcom/glority/android/picturexx/view/BaseCmsDetailFragment;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/databinding/ViewDataBinding;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/base/widget/webview/JsbWebView$MethodListener;", "<init>", "()V", "disabledAutoLogEvents", "", "", "getDisabledAutoLogEvents", "()Ljava/util/List;", "userImage", "", "getUserImage", "setUserImage", "(Ljava/util/List;)V", Args.cmsName, "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "getCmsName", "()Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "setCmsName", "(Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;)V", "cmsView", "Lcom/glority/android/cmsui2/view/CmsView;", "getCmsView", "()Lcom/glority/android/cmsui2/view/CmsView;", "setCmsView", "(Lcom/glority/android/cmsui2/view/CmsView;)V", "appBarLayout", "Landroid/view/View;", "getAppBarLayout", "()Landroid/view/View;", "setAppBarLayout", "(Landroid/view/View;)V", "collapsingToolbar", "Landroid/view/ViewGroup;", "progressLL", "collectionVm", "Lcom/glority/android/picturexx/vm/CollectionViewModel;", "getCollectionVm", "()Lcom/glority/android/picturexx/vm/CollectionViewModel;", "collectionVm$delegate", "Lkotlin/Lazy;", "jsAllowRules", "", "wishItem", "Lcom/glority/android/database/entities/WishItem;", "getWishItem", "()Lcom/glority/android/database/entities/WishItem;", "setWishItem", "(Lcom/glority/android/database/entities/WishItem;)V", Args.speciesUid, "getSpeciesUid", "()Ljava/lang/String;", "setSpeciesUid", "(Ljava/lang/String;)V", Args.varietyUid, "getVarietyUid", "setVarietyUid", Args.year, "getYear", "setYear", "webViewItem", "Lcom/glority/android/cmsui2/view/child/WebViewItemView;", "getWebViewItem", "()Lcom/glority/android/cmsui2/view/child/WebViewItemView;", "setWebViewItem", "(Lcom/glority/android/cmsui2/view/child/WebViewItemView;)V", "addCollectionMethod", "Lkotlin/Function0;", "", "shouldShowReferenceImages", "", "recognizeHeaderView", "Lcom/glority/android/picturexx/widget/RecognizeHeaderView;", "newRecognizeHeaderView", "Lcom/glority/android/picturexx/widget/NewRecognizeHeaderView;", "userSubjectSideUrl", "userDenominationSideUrl", "getLayoutId", "", "doCreateView", "savedInstanceState", "Landroid/os/Bundle;", "initObserver", "initView", "initToolBar", "visible", "visibleShare", "onScrollListener", "v", "scrollY", "oldScrollY", "scrollState", "back", "logEventAddPrefix", "logEventName", "bundle", "getLogEventPrefix", "initData", "retake", "addCollection", "Lcom/glority/android/picturexx/view/recognize/CollectionDetailEditDialogFragment;", "from", "clickAddCollection", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "fragment", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "shareApp", "it", "isResult", "updateCmsUi", "displayName", "holderDrawable", "Landroid/graphics/drawable/Drawable;", Args.subjectSideUrl, Args.denominationSideUrl, "userImages", "showLoadingUi", "getItemId", "", "()Ljava/lang/Long;", "getLogPageName", "addWish", "iv", "Landroid/widget/ImageView;", "context", "Landroid/content/Context;", "imageRes", "removeWish", "visibleToolBar", "initBottomBar", "hasAddToCollection", "collectionItem", "Lcom/glority/android/database/entities/CollectionItem;", "initActiveUi", "showPriceSelectYear", "onYearSelected", "showJoinReddit", "getDefaultYear", "getDisplayYear", "jsInvoke", "methodInvoke", "Lcom/glority/base/widget/webview/entity/MethodInvoke;", "methodCallback", "Lcom/glority/base/widget/webview/JsbWebView$MethodCallback;", "availableJsMethod", "Lcom/glority/base/widget/webview/AbsJsMethod;", "isSeriesCreated", LogEvents.customseries_sortbycreate, "getInjectJsVariableData", "", "", "mapJsFrom", "setCustomExtraJsInjectVariable", "cmsViewMarginTop", "setHeaderImage", "updatePageData", "getH5MyOfficialSet", "", "userSeriesListItem", "Lcom/glority/android/database/entities/UserSeriesListItem;", "isCollected", "openCamera", "baseJsMethod", "Lcom/glority/android/picturexx/js/method/BaseJsMethod;", "scene", "onChangeResultClick", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public abstract class BaseCmsDetailFragment<T extends ViewDataBinding> extends BaseFragment<T> implements JsbWebView.MethodListener {
    public static final int $stable = 8;
    public View appBarLayout;
    private CmsName cmsName;
    public CmsView cmsView;
    private ViewGroup collapsingToolbar;

    /* renamed from: collectionVm$delegate, reason: from kotlin metadata */
    private final Lazy collectionVm;
    private NewRecognizeHeaderView newRecognizeHeaderView;
    private View progressLL;
    private RecognizeHeaderView recognizeHeaderView;
    private boolean shouldShowReferenceImages;
    private String speciesUid;
    private String userDenominationSideUrl;
    private String userSubjectSideUrl;
    private String varietyUid;
    private WebViewItemView webViewItem;
    private WishItem wishItem;
    private String year;
    private List<String> userImage = new ArrayList();
    private Set<String> jsAllowRules = SetsKt.mutableSetOf("https://*.coinidentifierai.com");
    private Function0<Unit> addCollectionMethod = new Function0<Unit>() { // from class: com.glority.android.picturexx.view.BaseCmsDetailFragment$addCollectionMethod$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    };

    public abstract Long getItemId();

    public abstract void initData();

    public void initObserver() {
    }

    public void onChangeResultClick() {
    }

    public void onScrollListener(View v, int scrollY, int oldScrollY, int scrollState) {
        Intrinsics.checkNotNullParameter(v, "v");
    }

    public void onYearSelected(String year) {
        Intrinsics.checkNotNullParameter(year, "year");
    }

    public boolean showJoinReddit() {
        return true;
    }

    public boolean showPriceSelectYear() {
        return false;
    }

    public boolean visibleToolBar() {
        return true;
    }

    public BaseCmsDetailFragment() {
        final BaseCmsDetailFragment<T> baseCmsDetailFragment = this;
        final Function0 function0 = null;
        this.collectionVm = FragmentViewModelLazyKt.createViewModelLazy(baseCmsDetailFragment, Reflection.getOrCreateKotlinClass(CollectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.BaseCmsDetailFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = Fragment.this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.BaseCmsDetailFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = Function0.this;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = baseCmsDetailFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.BaseCmsDetailFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = Fragment.this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected List<String> getDisabledAutoLogEvents() {
        return CollectionsKt.listOf("show");
    }

    public final List<String> getUserImage() {
        return this.userImage;
    }

    public final void setUserImage(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.userImage = list;
    }

    public final CmsName getCmsName() {
        return this.cmsName;
    }

    public final void setCmsName(CmsName cmsName) {
        this.cmsName = cmsName;
    }

    public final CmsView getCmsView() {
        CmsView cmsView = this.cmsView;
        if (cmsView != null) {
            return cmsView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cmsView");
        return null;
    }

    public final void setCmsView(CmsView cmsView) {
        Intrinsics.checkNotNullParameter(cmsView, "<set-?>");
        this.cmsView = cmsView;
    }

    public final View getAppBarLayout() {
        View view = this.appBarLayout;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appBarLayout");
        return null;
    }

    public final void setAppBarLayout(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.appBarLayout = view;
    }

    public final CollectionViewModel getCollectionVm() {
        return (CollectionViewModel) this.collectionVm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final WishItem getWishItem() {
        return this.wishItem;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setWishItem(WishItem wishItem) {
        this.wishItem = wishItem;
    }

    public final String getSpeciesUid() {
        return this.speciesUid;
    }

    public final void setSpeciesUid(String str) {
        this.speciesUid = str;
    }

    public final String getVarietyUid() {
        return this.varietyUid;
    }

    public final void setVarietyUid(String str) {
        this.varietyUid = str;
    }

    public final String getYear() {
        return this.year;
    }

    public final void setYear(String str) {
        this.year = str;
    }

    public final WebViewItemView getWebViewItem() {
        return this.webViewItem;
    }

    public final void setWebViewItem(WebViewItemView webViewItemView) {
        this.webViewItem = webViewItemView;
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_custom_detail;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    public void doCreateView(Bundle savedInstanceState) {
        initView();
        initData();
        initObserver();
    }

    public void initView() {
        View findViewById;
        setAppBarLayout(requireView().findViewById(R.id.app_bar_layout));
        setCmsView((CmsView) requireView().findViewById(R.id.cms_view));
        this.progressLL = requireView().findViewById(R.id.progress_fl);
        this.collapsingToolbar = (ViewGroup) requireView().findViewById(R.id.collapsing_toolbar);
        if (!Intrinsics.areEqual(getPageName(), LogEvents.result) && (findViewById = requireView().findViewById(R.id.chatbot_view)) != null) {
            findViewById.setVisibility(8);
        }
        initToolBar(false, false);
        CmsView cmsView = getCmsView();
        ViewGroup.LayoutParams layoutParams = cmsView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = cmsViewMarginTop();
        cmsView.setLayoutParams(marginLayoutParams);
        getCmsView().setOnVerticalScrollChangeListener(new GlNestedScrollView.OnScrollChangeListener() { // from class: com.glority.android.picturexx.view.BaseCmsDetailFragment$$ExternalSyntheticLambda6
            @Override // com.glority.widget.scrollview.GlNestedScrollView.OnScrollChangeListener
            public final void onScrollChange(View view, int i, int i2, int i3) {
                BaseCmsDetailFragment.initView$lambda$1(BaseCmsDetailFragment.this, view, i, i2, i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(BaseCmsDetailFragment this$0, View view, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(view);
        this$0.onScrollListener(view, i, i2, i3);
    }

    public void initToolBar(boolean visible, boolean visibleShare) {
        ImageView imageView = (ImageView) requireView().findViewById(R.id.iv_close);
        ImageView imageView2 = (ImageView) requireView().findViewById(R.id.iv_share);
        View findViewById = getAppBarLayout().findViewById(R.id.iv_close2);
        View findViewById2 = getAppBarLayout().findViewById(R.id.iv_share2);
        Intrinsics.checkNotNull(imageView);
        ImageView imageView3 = imageView;
        imageView3.setVisibility(visible ? 0 : 8);
        Intrinsics.checkNotNull(imageView2);
        ImageView imageView4 = imageView2;
        imageView4.setVisibility(visible && visibleShare ? 0 : 8);
        Intrinsics.checkNotNull(findViewById2);
        findViewById2.setVisibility(visible && visibleShare ? 0 : 8);
        getAppBarLayout().setVisibility(visible ? 0 : 8);
        final int dimension = (int) ResUtils.getDimension(R.dimen.x300);
        ((AppBarLayout) requireView().findViewById(R.id.appbar)).addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: com.glority.android.picturexx.view.BaseCmsDetailFragment$$ExternalSyntheticLambda0
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                BaseCmsDetailFragment.initToolBar$lambda$2(dimension, this, appBarLayout, i);
            }
        });
        Intrinsics.checkNotNull(findViewById);
        ViewExtensionsKt.setSingleClickListener$default(findViewById, 0L, new Function1<View, Unit>(this) { // from class: com.glority.android.picturexx.view.BaseCmsDetailFragment$initToolBar$2
            final /* synthetic */ BaseCmsDetailFragment<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.back();
            }
        }, 1, (Object) null);
        ViewExtensionsKt.setSingleClickListener$default(findViewById2, 0L, new Function1<View, Unit>(this) { // from class: com.glority.android.picturexx.view.BaseCmsDetailFragment$initToolBar$3
            final /* synthetic */ BaseCmsDetailFragment<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.shareApp(it);
            }
        }, 1, (Object) null);
        ViewExtensionsKt.setSingleClickListener$default(imageView3, 0L, new Function1<View, Unit>(this) { // from class: com.glority.android.picturexx.view.BaseCmsDetailFragment$initToolBar$4
            final /* synthetic */ BaseCmsDetailFragment<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.back();
            }
        }, 1, (Object) null);
        ViewExtensionsKt.setSingleClickListener$default(imageView4, 0L, new Function1<View, Unit>(this) { // from class: com.glority.android.picturexx.view.BaseCmsDetailFragment$initToolBar$5
            final /* synthetic */ BaseCmsDetailFragment<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.shareApp(it);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initToolBar$lambda$2(int i, BaseCmsDetailFragment this$0, AppBarLayout appBarLayout, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getAppBarLayout().setAlpha((-i2) / i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void back() {
        logEventAddPrefix$default(this, LogEvents.close_click, null, 2, null);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    public static /* synthetic */ void logEventAddPrefix$default(BaseCmsDetailFragment baseCmsDetailFragment, String str, Bundle bundle, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logEventAddPrefix");
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        baseCmsDetailFragment.logEventAddPrefix(str, bundle);
    }

    public final void logEventAddPrefix(String logEventName, Bundle bundle) {
        Intrinsics.checkNotNullParameter(logEventName, "logEventName");
        logEvent(getLogEventPrefix() + logEventName, bundle);
    }

    private final String getLogEventPrefix() {
        return getPageName() + "_";
    }

    public void retake() {
        logEventAddPrefix$default(this, LogEvents.new_click, null, 2, null);
        CoreActivity.Companion companion = CoreActivity.INSTANCE;
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
        companion.start((RuntimePermissionActivity) requireActivity, new MainRecognizeProcess(), (r17 & 4) != 0 ? 1 : 2, (r17 & 8) != 0 ? false : true, LogEvents.detail_retake, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null);
        if (Intrinsics.areEqual(getPageName(), LogEvents.result)) {
            ViewExtensionsKt.finish(this);
        }
    }

    public static /* synthetic */ CollectionDetailEditDialogFragment addCollection$default(BaseCmsDetailFragment baseCmsDetailFragment, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addCollection");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return baseCmsDetailFragment.addCollection(str);
    }

    public CollectionDetailEditDialogFragment addCollection(String from) {
        if (!isAdded()) {
            return null;
        }
        logEventAddPrefix$default(this, LogEvents.addcollection_click, null, 2, null);
        String tagValue = CmsDataUtils.INSTANCE.getTagValue(this.cmsName, "PreferredSeries");
        CmsName cmsName = this.cmsName;
        if (cmsName == null) {
            return null;
        }
        Long itemId = getItemId();
        return CollectionDetailEditDialogFragment.Companion.createOpen$default(CollectionDetailEditDialogFragment.INSTANCE, getSupportFragmentManager(), (itemId == null || itemId.longValue() != 0) ? getItemId() : null, cmsName.getUid(), getYear(), this.userImage, 0, getPageName(), cmsName, tagValue, null, null, null, null, null, 15872, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void clickAddCollection$default(BaseCmsDetailFragment baseCmsDetailFragment, String str, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clickAddCollection");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        baseCmsDetailFragment.clickAddCollection(str, function1);
    }

    public final void clickAddCollection(String from, Function1<? super CollectionDetailEditDialogFragment, Unit> callback) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new BaseCmsDetailFragment$clickAddCollection$1(this, from, callback, null), 3, null);
    }

    @Override // com.glority.base.fragment.BaseFragment, androidx.fragment.app.Fragment, com.glority.base.presenter.IResultManager
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 20 && AppViewModel.INSTANCE.isVip()) {
            this.addCollectionMethod.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shareApp(View it) {
        logEventAddPrefix$default(this, LogEvents.share_click, null, 2, null);
        ShareUtil.INSTANCE.shareAPP(it.getContext());
    }

    private final boolean isResult() {
        return Intrinsics.areEqual(getPageName(), LogEvents.result);
    }

    public static /* synthetic */ void updateCmsUi$default(BaseCmsDetailFragment baseCmsDetailFragment, CmsName cmsName, String str, Drawable drawable, String str2, String str3, List list, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCmsUi");
        }
        baseCmsDetailFragment.updateCmsUi(cmsName, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : drawable, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) == 0 ? list : null);
    }

    public void updateCmsUi(CmsName cmsName, String displayName, Drawable holderDrawable, String subjectSideUrl, String denominationSideUrl, List<String> userImages) {
        String pageName;
        String lightUrl;
        if (cmsName == null) {
            return;
        }
        View view = this.progressLL;
        if (view != null) {
            view.setVisibility(8);
        }
        this.userSubjectSideUrl = subjectSideUrl;
        this.userDenominationSideUrl = denominationSideUrl;
        ViewGroup viewGroup = this.collapsingToolbar;
        AttributeSet attributeSet = null;
        byte b = 0;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("collapsingToolbar");
            viewGroup = null;
        }
        viewGroup.removeAllViews();
        getCmsView().removeAllViews();
        CmsView cmsView = getCmsView();
        Pair[] pairArr = new Pair[3];
        Bundle arguments = getArguments();
        if (arguments == null || (pageName = arguments.getString("from")) == null) {
            pageName = getPageName();
        }
        pairArr[0] = TuplesKt.to("from", pageName);
        pairArr[1] = TuplesKt.to(LogEventArguments.ARG_STRING_1, String.valueOf(getItemId()));
        int i = 2;
        pairArr[2] = TuplesKt.to(LogEventArguments.ARG_STRING_2, cmsName.getUid());
        cmsView.setCommonLogEventBundle(BundleKt.bundleOf(pairArr));
        this.cmsName = cmsName;
        this.userImage = CollectionsKt.toMutableList((Collection) (userImages == null ? CollectionsKt.listOfNotNull((Object[]) new String[]{subjectSideUrl, denominationSideUrl}) : userImages));
        initActiveUi(cmsName);
        try {
            if (!CoinAbTestUtils.INSTANCE.enableV4H5()) {
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                this.recognizeHeaderView = new RecognizeHeaderView(requireContext, attributeSet, i, b == true ? 1 : 0);
                ViewGroup viewGroup2 = this.collapsingToolbar;
                if (viewGroup2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("collapsingToolbar");
                    viewGroup2 = null;
                }
                viewGroup2.addView(this.recognizeHeaderView, -1, -1);
            } else {
                View findViewById = requireView().findViewById(R.id.appbar);
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                layoutParams.height = getResources().getDimensionPixelOffset(R.dimen.x750);
                findViewById.setLayoutParams(layoutParams);
                findViewById.requestLayout();
                Context requireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                this.newRecognizeHeaderView = new NewRecognizeHeaderView(requireContext2, null, 0, 6, null);
                ViewGroup viewGroup3 = this.collapsingToolbar;
                if (viewGroup3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("collapsingToolbar");
                    viewGroup3 = null;
                }
                viewGroup3.addView(this.newRecognizeHeaderView, -1, -1);
            }
            setHeaderImage(cmsName, subjectSideUrl, denominationSideUrl);
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
        CmsStaticUrl cmsStaticUrl = cmsName.getCmsStaticUrl();
        if (cmsStaticUrl != null && (lightUrl = cmsStaticUrl.getLightUrl()) != null) {
            LogUtils.d("h5: " + lightUrl);
            Context context = getContext();
            if (context != null) {
                CmsView.addItem$default(getCmsView(), CmsFactory.INSTANCE.createLoadingView(), null, 2, null);
                CmsItemEntity createWebView = CmsFactory.INSTANCE.createWebView(context, lightUrl, this.jsAllowRules, this, getInjectJsVariableData(), new Function0<Unit>(this) { // from class: com.glority.android.picturexx.view.BaseCmsDetailFragment$updateCmsUi$2$webviewItem$1
                    final /* synthetic */ BaseCmsDetailFragment<T> this$0;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.this$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* compiled from: BaseCmsDetailFragment.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                    @DebugMetadata(c = "com.glority.android.picturexx.view.BaseCmsDetailFragment$updateCmsUi$2$webviewItem$1$1", f = "BaseCmsDetailFragment.kt", i = {}, l = {319}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: com.glority.android.picturexx.view.BaseCmsDetailFragment$updateCmsUi$2$webviewItem$1$1, reason: invalid class name */
                    /* loaded from: classes5.dex */
                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        int label;
                        final /* synthetic */ BaseCmsDetailFragment<T> this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(BaseCmsDetailFragment<T> baseCmsDetailFragment, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.this$0 = baseCmsDetailFragment;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass1(this.this$0, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            JsbWebView webView;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                this.label = 1;
                                if (DelayKt.delay(300L, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            WebViewItemView webViewItem = this.this$0.getWebViewItem();
                            if (webViewItem != null && (webView = webViewItem.getWebView()) != null) {
                                final BaseCmsDetailFragment<T> baseCmsDetailFragment = this.this$0;
                                webView.evaluateJavascript("window.isCollectionRecommend();", 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003f: INVOKE 
                                      (r4v7 'webView' com.glority.base.widget.webview.JsbWebView)
                                      ("window.isCollectionRecommend();")
                                      (wrap:android.webkit.ValueCallback:0x003a: CONSTRUCTOR (r0v1 'baseCmsDetailFragment' com.glority.android.picturexx.view.BaseCmsDetailFragment<T> A[DONT_INLINE]) A[MD:(com.glority.android.picturexx.view.BaseCmsDetailFragment):void (m), WRAPPED] call: com.glority.android.picturexx.view.BaseCmsDetailFragment$updateCmsUi$2$webviewItem$1$1$$ExternalSyntheticLambda0.<init>(com.glority.android.picturexx.view.BaseCmsDetailFragment):void type: CONSTRUCTOR)
                                     VIRTUAL call: com.glority.base.widget.webview.JsbWebView.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void A[MD:(java.lang.String, android.webkit.ValueCallback):void (s)] in method: com.glority.android.picturexx.view.BaseCmsDetailFragment$updateCmsUi$2$webviewItem$1.1.invokeSuspend(java.lang.Object):java.lang.Object, file: classes5.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.glority.android.picturexx.view.BaseCmsDetailFragment$updateCmsUi$2$webviewItem$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:304)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:781)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1117)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:884)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 21 more
                                    */
                                /*
                                    this = this;
                                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r1 = r3.label
                                    r2 = 1
                                    if (r1 == 0) goto L17
                                    if (r1 != r2) goto Lf
                                    kotlin.ResultKt.throwOnFailure(r4)
                                    goto L28
                                Lf:
                                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                    r4.<init>(r0)
                                    throw r4
                                L17:
                                    kotlin.ResultKt.throwOnFailure(r4)
                                    r4 = r3
                                    kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                                    r3.label = r2
                                    r1 = 300(0x12c, double:1.48E-321)
                                    java.lang.Object r4 = kotlinx.coroutines.DelayKt.delay(r1, r4)
                                    if (r4 != r0) goto L28
                                    return r0
                                L28:
                                    com.glority.android.picturexx.view.BaseCmsDetailFragment<T> r4 = r3.this$0
                                    com.glority.android.cmsui2.view.child.WebViewItemView r4 = r4.getWebViewItem()
                                    if (r4 == 0) goto L42
                                    com.glority.base.widget.webview.JsbWebView r4 = r4.getWebView()
                                    if (r4 == 0) goto L42
                                    com.glority.android.picturexx.view.BaseCmsDetailFragment<T> r0 = r3.this$0
                                    com.glority.android.picturexx.view.BaseCmsDetailFragment$updateCmsUi$2$webviewItem$1$1$$ExternalSyntheticLambda0 r1 = new com.glority.android.picturexx.view.BaseCmsDetailFragment$updateCmsUi$2$webviewItem$1$1$$ExternalSyntheticLambda0
                                    r1.<init>(r0)
                                    java.lang.String r0 = "window.isCollectionRecommend();"
                                    r4.evaluateJavascript(r0, r1)
                                L42:
                                    kotlin.Unit r4 = kotlin.Unit.INSTANCE
                                    return r4
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.view.BaseCmsDetailFragment$updateCmsUi$2$webviewItem$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final void invokeSuspend$lambda$0(BaseCmsDetailFragment baseCmsDetailFragment, String str) {
                                NewRecognizeHeaderView newRecognizeHeaderView;
                                NewRecognizeHeaderView newRecognizeHeaderView2;
                                NewRecognizeHeaderView newRecognizeHeaderView3;
                                LogUtils.e("isCollectionRecommend: " + str);
                                if (str == null || !Boolean.parseBoolean(str)) {
                                    newRecognizeHeaderView = baseCmsDetailFragment.newRecognizeHeaderView;
                                    if (newRecognizeHeaderView != null) {
                                        newRecognizeHeaderView.hideCollectorChoice();
                                        return;
                                    }
                                    return;
                                }
                                newRecognizeHeaderView2 = baseCmsDetailFragment.newRecognizeHeaderView;
                                if (newRecognizeHeaderView2 != null) {
                                    newRecognizeHeaderView2.startAnimation();
                                }
                                newRecognizeHeaderView3 = baseCmsDetailFragment.newRecognizeHeaderView;
                                if (newRecognizeHeaderView3 != null) {
                                    newRecognizeHeaderView3.showCollectorChoice();
                                }
                            }
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.this$0), null, null, new AnonymousClass1(this.this$0, null), 3, null);
                            this.this$0.getCmsView().removeItem(38);
                        }
                    });
                    BaseCmsItemView item = createWebView.getItem();
                    Intrinsics.checkNotNull(item, "null cannot be cast to non-null type com.glority.android.cmsui2.view.child.WebViewItemView");
                    this.webViewItem = (WebViewItemView) item;
                    CmsView.addItem$default(getCmsView(), createWebView, null, 2, null);
                }
            }
            if (showJoinReddit()) {
                CmsView.addItem$default(getCmsView(), CmsFactory.INSTANCE.createItemSeparator(), null, 2, null);
                CmsView.addItem$default(getCmsView(), CmsFactory.INSTANCE.createJoinRedditView(), null, 2, null);
            }
        }

        public final void showLoadingUi(List<String> userImage, Drawable holderDrawable) {
            Intrinsics.checkNotNullParameter(userImage, "userImage");
            View view = this.progressLL;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = getRootView();
            ImageView imageView = view2 != null ? (ImageView) view2.findViewById(R.id.header_iv) : null;
            if (imageView != null) {
                Glide.with(imageView).load((String) CollectionsKt.firstOrNull((List) userImage)).placeholder(holderDrawable).into(imageView);
            }
            CmsView.addItem$default(getCmsView(), CmsFactory.INSTANCE.createLoadingView(), null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.glority.android.ui.base.v2.BaseFragment
        /* renamed from: getLogPageName */
        public String getPageName() {
            return "detail";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void addWish(final ImageView iv, final Context context, final int imageRes) {
            String str;
            String str2;
            String imageUrl;
            Intrinsics.checkNotNullParameter(iv, "iv");
            Intrinsics.checkNotNullParameter(context, "context");
            Pair[] pairArr = new Pair[3];
            pairArr[0] = TuplesKt.to("type", "add");
            Bundle arguments = getArguments();
            String str3 = "";
            if (arguments == null || (str = arguments.getString("from")) == null) {
                str = "";
            }
            pairArr[1] = TuplesKt.to("from", str);
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (str2 = arguments2.getString(Args.uid)) == null) {
                str2 = "";
            }
            pairArr[2] = TuplesKt.to("id", str2);
            logEventAddPrefix(LogEvents.wish_click, BundleKt.bundleOf(pairArr));
            CmsName cmsName = this.cmsName;
            if (cmsName != null) {
                WishRepository wishRepository = WishRepository.INSTANCE;
                String uid = cmsName.getUid();
                String parsePriceRangeByYears = CmsDataUtils.INSTANCE.parsePriceRangeByYears(StringsKt.split$default((CharSequence) CollectionsKt.last(StringsKt.split$default((CharSequence) cmsName.getName().getPreferredName(), new String[]{" "}, false, 0, 6, (Object) null)), new String[]{"~"}, false, 0, 6, (Object) null), cmsName);
                if (parsePriceRangeByYears == null) {
                    parsePriceRangeByYears = CmsDataUtils.INSTANCE.getPriceFromCms(cmsName);
                }
                String preferredName = cmsName.getName().getPreferredName();
                CmsImage mainImage = cmsName.getMainImage();
                if (mainImage != null && (imageUrl = mainImage.getImageUrl()) != null) {
                    str3 = imageUrl;
                }
                wishRepository.addWishMessage(uid, parsePriceRangeByYears, preferredName, str3).observe(this, new BaseCmsDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1<WishItem, Unit>(this) { // from class: com.glority.android.picturexx.view.BaseCmsDetailFragment$addWish$1$1
                    final /* synthetic */ BaseCmsDetailFragment<T> this$0;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                        this.this$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(WishItem wishItem) {
                        invoke2(wishItem);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(WishItem wishItem) {
                        if (wishItem != null) {
                            this.this$0.setWishItem(wishItem);
                            AddWishSuccessDialog addWishSuccessDialog = AddWishSuccessDialog.INSTANCE;
                            Context context2 = context;
                            final ImageView imageView = iv;
                            final int i = imageRes;
                            addWishSuccessDialog.open(context2, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.BaseCmsDetailFragment$addWish$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    imageView.setImageResource(i);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    ImageView imageView2 = imageView;
                                    animatorSet.setTarget(imageView2);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView2, "scaleX", 1.0f, 1.8f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, "scaleY", 1.0f, 1.8f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView2, "scaleX", 1.8f, 1.0f);
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView2, "scaleY", 1.8f, 1.0f);
                                    animatorSet.setDuration(250L);
                                    ObjectAnimator objectAnimator = ofFloat;
                                    animatorSet.play(objectAnimator).with(ofFloat2);
                                    animatorSet.play(ofFloat3).with(ofFloat4).after(objectAnimator);
                                    animatorSet.start();
                                }
                            });
                            return;
                        }
                        ToastUtils.showError(R.string.text_error, new Object[0]);
                    }
                }));
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void removeWish(final ImageView iv, final Context context, final int imageRes) {
            String str;
            String string;
            Intrinsics.checkNotNullParameter(iv, "iv");
            Intrinsics.checkNotNullParameter(context, "context");
            Pair[] pairArr = new Pair[3];
            pairArr[0] = TuplesKt.to("type", "remove");
            Bundle arguments = getArguments();
            String str2 = "";
            if (arguments == null || (str = arguments.getString("from")) == null) {
                str = "";
            }
            pairArr[1] = TuplesKt.to("from", str);
            Bundle arguments2 = getArguments();
            if (arguments2 != null && (string = arguments2.getString(Args.uid)) != null) {
                str2 = string;
            }
            pairArr[2] = TuplesKt.to("id", str2);
            logEventAddPrefix(LogEvents.wish_click, BundleKt.bundleOf(pairArr));
            WishItem wishItem = this.wishItem;
            if (wishItem != null) {
                WishRepository.INSTANCE.deleteItem(wishItem.getWishId()).observe(this, new BaseCmsDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1<Status, Unit>(this) { // from class: com.glority.android.picturexx.view.BaseCmsDetailFragment$removeWish$1$1
                    final /* synthetic */ BaseCmsDetailFragment<T> this$0;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                        this.this$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Status status) {
                        invoke2(status);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Status status) {
                        if (status == Status.SUCCESS) {
                            this.this$0.setWishItem(null);
                            RemoveWishSuccessDialog removeWishSuccessDialog = RemoveWishSuccessDialog.INSTANCE;
                            Context context2 = context;
                            final ImageView imageView = iv;
                            final int i = imageRes;
                            removeWishSuccessDialog.open(context2, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.BaseCmsDetailFragment$removeWish$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    imageView.setImageResource(i);
                                }
                            });
                            return;
                        }
                        if (status == Status.ERROR) {
                            ToastUtils.showError(R.string.text_error, new Object[0]);
                        }
                    }
                }));
            }
        }

        public void initBottomBar(boolean hasAddToCollection, CmsName cmsName, CollectionItem collectionItem) {
            ViewGroup viewGroup;
            Intrinsics.checkNotNullParameter(cmsName, "cmsName");
            View view = getRootView();
            if (view == null || (viewGroup = (ViewGroup) view.findViewById(R.id.bottom_bar)) == null) {
                return;
            }
            viewGroup.removeAllViews();
            try {
                boolean z = this.wishItem != null;
                if (hasAddToCollection) {
                    final CmsDetailBottomBar1Binding inflate = CmsDetailBottomBar1Binding.inflate(getLayoutInflater());
                    Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
                    viewGroup.addView(inflate.getRoot(), -1, -1);
                    inflate.addBt.setText("+ " + getString(R.string.identify_result_add));
                    final MaterialButton addBt = inflate.addBt;
                    Intrinsics.checkNotNullExpressionValue(addBt, "addBt");
                    MaterialButton addBt2 = inflate.addBt;
                    Intrinsics.checkNotNullExpressionValue(addBt2, "addBt");
                    ViewExtensionsKt.setSingleClickListener$default(addBt2, 0L, new Function1<View, Unit>(this) { // from class: com.glority.android.picturexx.view.BaseCmsDetailFragment$initBottomBar$1$1
                        final /* synthetic */ BaseCmsDetailFragment<T> this$0;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                            this.this$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                            invoke2(view2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(View it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            BaseCmsDetailFragment.clickAddCollection$default(this.this$0, null, null, 3, null);
                        }
                    }, 1, (Object) null);
                    inflate.wishIv.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.BaseCmsDetailFragment$$ExternalSyntheticLambda1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            BaseCmsDetailFragment.initBottomBar$lambda$14$lambda$9(BaseCmsDetailFragment.this, inflate, view2);
                        }
                    });
                    inflate.newIv.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.BaseCmsDetailFragment$$ExternalSyntheticLambda2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            BaseCmsDetailFragment.initBottomBar$lambda$14$lambda$10(BaseCmsDetailFragment.this, view2);
                        }
                    });
                    inflate.llBottom.getLayoutTransition().enableTransitionType(4);
                    addBt.postDelayed(new Runnable() { // from class: com.glority.android.picturexx.view.BaseCmsDetailFragment$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            BaseCmsDetailFragment.initBottomBar$lambda$14$lambda$11(BaseCmsDetailFragment.this, addBt);
                        }
                    }, 350L);
                    inflate.wishIv.setImageResource(z ? R.drawable.icon_wished_cicle : R.drawable.icon_unwish_circle);
                } else {
                    final CmsDetailBottomBar2Binding inflate2 = CmsDetailBottomBar2Binding.inflate(getLayoutInflater());
                    Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
                    viewGroup.addView(inflate2.getRoot(), -1, -1);
                    inflate2.wishIv.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.BaseCmsDetailFragment$$ExternalSyntheticLambda4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            BaseCmsDetailFragment.initBottomBar$lambda$14$lambda$12(BaseCmsDetailFragment.this, inflate2, view2);
                        }
                    });
                    inflate2.newIv.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.BaseCmsDetailFragment$$ExternalSyntheticLambda5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            BaseCmsDetailFragment.initBottomBar$lambda$14$lambda$13(BaseCmsDetailFragment.this, view2);
                        }
                    });
                    ImageView shareIv = inflate2.shareIv;
                    Intrinsics.checkNotNullExpressionValue(shareIv, "shareIv");
                    ViewExtensionsKt.setSingleClickListener$default(shareIv, 0L, new Function1<View, Unit>(this) { // from class: com.glority.android.picturexx.view.BaseCmsDetailFragment$initBottomBar$1$7
                        final /* synthetic */ BaseCmsDetailFragment<T> this$0;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                            this.this$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                            invoke2(view2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(View it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            this.this$0.shareApp(it);
                        }
                    }, 1, (Object) null);
                    inflate2.wishIv.setImageResource(z ? R.drawable.icon_wished : R.drawable.icon_unwish);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void initBottomBar$lambda$14$lambda$9(BaseCmsDetailFragment this$0, CmsDetailBottomBar1Binding bottomBar1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(bottomBar1, "$bottomBar1");
            if (this$0.wishItem != null) {
                ImageView wishIv = bottomBar1.wishIv;
                Intrinsics.checkNotNullExpressionValue(wishIv, "wishIv");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                this$0.removeWish(wishIv, context, R.drawable.icon_unwish_circle);
                return;
            }
            ImageView wishIv2 = bottomBar1.wishIv;
            Intrinsics.checkNotNullExpressionValue(wishIv2, "wishIv");
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            this$0.addWish(wishIv2, context2, R.drawable.icon_wished_cicle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void initBottomBar$lambda$14$lambda$10(BaseCmsDetailFragment this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.retake();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void initBottomBar$lambda$14$lambda$11(BaseCmsDetailFragment this$0, MaterialButton addCollectionBt) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(addCollectionBt, "$addCollectionBt");
            if (this$0.isDetached()) {
                return;
            }
            addCollectionBt.setVisibility(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void initBottomBar$lambda$14$lambda$12(BaseCmsDetailFragment this$0, CmsDetailBottomBar2Binding bottomBar2, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(bottomBar2, "$bottomBar2");
            if (this$0.wishItem != null) {
                ImageView wishIv = bottomBar2.wishIv;
                Intrinsics.checkNotNullExpressionValue(wishIv, "wishIv");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                this$0.removeWish(wishIv, context, R.drawable.icon_unwish);
                return;
            }
            ImageView wishIv2 = bottomBar2.wishIv;
            Intrinsics.checkNotNullExpressionValue(wishIv2, "wishIv");
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            this$0.addWish(wishIv2, context2, R.drawable.icon_wished);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void initBottomBar$lambda$14$lambda$13(BaseCmsDetailFragment this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.retake();
        }

        private final void initActiveUi(final CmsName cmsName) {
            DBManager.INSTANCE.getCollectionItemDao().getAllSimpleItems().observe(this, new BaseCmsDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends SimpleCollectionItem>, Unit>(this) { // from class: com.glority.android.picturexx.view.BaseCmsDetailFragment$initActiveUi$1
                final /* synthetic */ BaseCmsDetailFragment<T> this$0;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: BaseCmsDetailFragment.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                @DebugMetadata(c = "com.glority.android.picturexx.view.BaseCmsDetailFragment$initActiveUi$1$1", f = "BaseCmsDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.glority.android.picturexx.view.BaseCmsDetailFragment$initActiveUi$1$1, reason: invalid class name */
                /* loaded from: classes5.dex */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ CmsName $cmsName;
                    final /* synthetic */ List<SimpleCollectionItem> $it;
                    private /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ BaseCmsDetailFragment<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(List<SimpleCollectionItem> list, BaseCmsDetailFragment<T> baseCmsDetailFragment, CmsName cmsName, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = list;
                        this.this$0 = baseCmsDetailFragment;
                        this.$cmsName = cmsName;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, this.this$0, this.$cmsName, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
                    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                        /*
                            r10 = this;
                            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r0 = r10.label
                            if (r0 != 0) goto Le1
                            kotlin.ResultKt.throwOnFailure(r11)
                            java.lang.Object r11 = r10.L$0
                            r0 = r11
                            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                            com.glority.android.database.DBManager r11 = com.glority.android.database.DBManager.INSTANCE
                            com.glority.android.database.dao.WishItemDao r11 = r11.getWishItemDao()
                            com.glority.base.viewmodel.AppViewModel$Companion r1 = com.glority.base.viewmodel.AppViewModel.INSTANCE
                            com.glority.base.viewmodel.AppViewModel r1 = r1.getInstance()
                            androidx.lifecycle.MutableLiveData r1 = r1.getUser()
                            java.lang.Object r1 = r1.getValue()
                            com.glority.component.generatedAPI.kotlinAPI.user.User r1 = (com.glority.component.generatedAPI.kotlinAPI.user.User) r1
                            if (r1 == 0) goto L2c
                            long r1 = r1.getUserId()
                            goto L2e
                        L2c:
                            r1 = 0
                        L2e:
                            java.util.List r5 = r11.getAllSync(r1)
                            java.util.List<com.glority.android.database.entities.SimpleCollectionItem> r11 = r10.$it
                            java.lang.String r1 = "$it"
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)
                            java.lang.Iterable r11 = (java.lang.Iterable) r11
                            com.glority.android.picturexx.view.BaseCmsDetailFragment<T> r1 = r10.this$0
                            com.glority.component.generatedAPI.kotlinAPI.cms.CmsName r2 = r10.$cmsName
                            java.util.Iterator r11 = r11.iterator()
                        L43:
                            boolean r3 = r11.hasNext()
                            r4 = 0
                            if (r3 == 0) goto L83
                            java.lang.Object r3 = r11.next()
                            r6 = r3
                            com.glority.android.database.entities.SimpleCollectionItem r6 = (com.glority.android.database.entities.SimpleCollectionItem) r6
                            java.lang.Long r7 = r1.getItemId()
                            if (r7 != 0) goto L66
                            java.lang.String r6 = r6.getUid()
                            java.lang.String r7 = r2.getUid()
                            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
                            if (r6 == 0) goto L43
                            goto L84
                        L66:
                            java.lang.Long r7 = r6.getItemId()
                            java.lang.Long r8 = r1.getItemId()
                            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r8)
                            if (r7 == 0) goto L43
                            java.lang.String r6 = r6.getUid()
                            java.lang.String r7 = r2.getUid()
                            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
                            if (r6 == 0) goto L43
                            goto L84
                        L83:
                            r3 = r4
                        L84:
                            com.glority.android.database.entities.SimpleCollectionItem r3 = (com.glority.android.database.entities.SimpleCollectionItem) r3
                            if (r3 == 0) goto L91
                            int r11 = r3.getCollectionId()
                            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r11)
                            goto L92
                        L91:
                            r11 = r4
                        L92:
                            if (r11 != 0) goto Lae
                            com.glority.android.picturexx.view.BaseCmsDetailFragment<T> r1 = r10.this$0
                            android.os.Bundle r1 = r1.getArguments()
                            if (r1 == 0) goto La3
                            java.lang.String r2 = "from"
                            java.lang.String r1 = r1.getString(r2)
                            goto La4
                        La3:
                            r1 = r4
                        La4:
                            java.lang.String r2 = "collectionslist"
                            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                            if (r1 != 0) goto Lae
                            r1 = 1
                            goto Laf
                        Lae:
                            r1 = 0
                        Laf:
                            r6 = r1
                            if (r11 == 0) goto Lc2
                            com.glority.android.database.DBManager r1 = com.glority.android.database.DBManager.INSTANCE
                            com.glority.android.database.dao.CollectionItemDao r1 = r1.getCollectionItemDao()
                            int r11 = r11.intValue()
                            com.glority.android.database.entities.CollectionItem r11 = r1.getItemSync(r11)
                            r8 = r11
                            goto Lc3
                        Lc2:
                            r8 = r4
                        Lc3:
                            kotlinx.coroutines.MainCoroutineDispatcher r11 = kotlinx.coroutines.Dispatchers.getMain()
                            r1 = r11
                            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
                            com.glority.android.picturexx.view.BaseCmsDetailFragment$initActiveUi$1$1$1 r11 = new com.glority.android.picturexx.view.BaseCmsDetailFragment$initActiveUi$1$1$1
                            com.glority.android.picturexx.view.BaseCmsDetailFragment<T> r4 = r10.this$0
                            com.glority.component.generatedAPI.kotlinAPI.cms.CmsName r7 = r10.$cmsName
                            r9 = 0
                            r3 = r11
                            r3.<init>(r4, r5, r6, r7, r8, r9)
                            r3 = r11
                            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
                            r4 = 2
                            r5 = 0
                            r2 = 0
                            kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
                            kotlin.Unit r11 = kotlin.Unit.INSTANCE
                            return r11
                        Le1:
                            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r11.<init>(r0)
                            throw r11
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.view.BaseCmsDetailFragment$initActiveUi$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* compiled from: BaseCmsDetailFragment.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                    @DebugMetadata(c = "com.glority.android.picturexx.view.BaseCmsDetailFragment$initActiveUi$1$1$1", f = "BaseCmsDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: com.glority.android.picturexx.view.BaseCmsDetailFragment$initActiveUi$1$1$1, reason: invalid class name and collision with other inner class name */
                    /* loaded from: classes5.dex */
                    public static final class C01041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ CmsName $cmsName;
                        final /* synthetic */ CollectionItem $collectionItem;
                        final /* synthetic */ boolean $showCollectionBt;
                        final /* synthetic */ List<WishItem> $wishList;
                        int label;
                        final /* synthetic */ BaseCmsDetailFragment<T> this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C01041(BaseCmsDetailFragment<T> baseCmsDetailFragment, List<WishItem> list, boolean z, CmsName cmsName, CollectionItem collectionItem, Continuation<? super C01041> continuation) {
                            super(2, continuation);
                            this.this$0 = baseCmsDetailFragment;
                            this.$wishList = list;
                            this.$showCollectionBt = z;
                            this.$cmsName = cmsName;
                            this.$collectionItem = collectionItem;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C01041(this.this$0, this.$wishList, this.$showCollectionBt, this.$cmsName, this.$collectionItem, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C01041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object obj2;
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            if (!this.this$0.isDetached()) {
                                BaseCmsDetailFragment<T> baseCmsDetailFragment = this.this$0;
                                List<WishItem> list = this.$wishList;
                                boolean z = this.$showCollectionBt;
                                CmsName cmsName = this.$cmsName;
                                CollectionItem collectionItem = this.$collectionItem;
                                try {
                                    Iterator<T> it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = it.next();
                                        if (Intrinsics.areEqual(((WishItem) obj2).getUid(), cmsName.getUid())) {
                                            break;
                                        }
                                    }
                                    baseCmsDetailFragment.setWishItem((WishItem) obj2);
                                    baseCmsDetailFragment.initToolBar(baseCmsDetailFragment.visibleToolBar(), z);
                                    baseCmsDetailFragment.initBottomBar(z, cmsName, collectionItem);
                                    Unit unit = Unit.INSTANCE;
                                } catch (Exception e) {
                                    if (AppContext.INSTANCE.isDebugMode()) {
                                        LogUtils.e(Log.getStackTraceString(e));
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<? extends SimpleCollectionItem> list) {
                    invoke2((List<SimpleCollectionItem>) list);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<SimpleCollectionItem> list) {
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.this$0), Dispatchers.getIO(), null, new AnonymousClass1(list, this.this$0, cmsName, null), 2, null);
                }
            }));
        }

        /* renamed from: getDefaultYear */
        public String getRecognizeYear() {
            return CmsDataUtils.INSTANCE.getTagValue(this.cmsName, "Year");
        }

        /* renamed from: getDisplayYear, reason: from getter */
        public final String getYear() {
            return this.year;
        }

        @Override // com.glority.base.widget.webview.JsbWebView.MethodListener
        public void jsInvoke(MethodInvoke methodInvoke, JsbWebView.MethodCallback methodCallback) {
            Intrinsics.checkNotNullParameter(methodInvoke, "methodInvoke");
            LogUtils.d(methodInvoke.getMethod(), methodInvoke.getParams());
            final FragmentActivity requireActivity = requireActivity();
            final String pageName = getPageName();
            BaseJsMethod baseJsMethod = new BaseJsMethod(this, requireActivity, pageName) { // from class: com.glority.android.picturexx.view.BaseCmsDetailFragment$jsInvoke$baseJsMethod$1
                final /* synthetic */ BaseCmsDetailFragment<T> this$0;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super((RuntimePermissionActivity) requireActivity, pageName);
                    this.this$0 = this;
                    Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
                }

                @Override // com.glority.android.picturexx.js.method.BaseJsMethod
                public void openCamera(String scene) {
                    this.this$0.openCamera(this, scene);
                }
            };
            FragmentActivity requireActivity2 = requireActivity();
            Intrinsics.checkNotNull(requireActivity2, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
            CmsJsMethod cmsJsMethod = new CmsJsMethod(this, (RuntimePermissionActivity) requireActivity2, getPageName());
            FragmentActivity requireActivity3 = requireActivity();
            Intrinsics.checkNotNull(requireActivity3, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
            MediatorJsMethod mediatorJsMethod = new MediatorJsMethod((RuntimePermissionActivity) requireActivity3, getPageName());
            mediatorJsMethod.mergeJsMethod(baseJsMethod);
            mediatorJsMethod.mergeJsMethod(cmsJsMethod);
            Iterator<T> it = availableJsMethod().iterator();
            while (it.hasNext()) {
                mediatorJsMethod.mergeJsMethod((AbsJsMethod) it.next());
            }
            mediatorJsMethod.invoke(methodInvoke, methodCallback);
        }

        public List<AbsJsMethod> availableJsMethod() {
            return new ArrayList();
        }

        public final void isSeriesCreated(Function1<? super Boolean, Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            String tagValue = CmsDataUtils.INSTANCE.getTagValue(this.cmsName, "PreferredSeries");
            String str = tagValue;
            if (str != null && str.length() != 0) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new BaseCmsDetailFragment$isSeriesCreated$1(tagValue, callback, null), 2, null);
            } else {
                callback.invoke(false);
            }
        }

        public final Map<String, Object> getInjectJsVariableData() {
            Display defaultDisplay;
            FragmentActivity activity = getActivity();
            WindowManager windowManager = (WindowManager) (activity != null ? activity.getSystemService("window") : null);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            Pair[] pairArr = new Pair[7];
            Long itemId = getItemId();
            pairArr[0] = TuplesKt.to("itemId", itemId != null ? itemId.toString() : null);
            CmsName cmsName = this.cmsName;
            pairArr[1] = TuplesKt.to(Args.uid, cmsName != null ? cmsName.getUid() : null);
            pairArr[2] = TuplesKt.to(Args.year, getRecognizeYear());
            pairArr[3] = TuplesKt.to("priceVersion", CoinAbTestUtils.INSTANCE.getH5PriceABVariable());
            pairArr[4] = TuplesKt.to(Args.pageName, getPageName());
            pairArr[5] = TuplesKt.to("from", mapJsFrom());
            pairArr[6] = TuplesKt.to(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, CoinConfigUtils.INSTANCE.getCountryCode());
            Map<String, Object> mutableMapOf = MapsKt.mutableMapOf(pairArr);
            mutableMapOf.putAll(setCustomExtraJsInjectVariable());
            return mutableMapOf;
        }

        private final String mapJsFrom() {
            return PageNameMapUtils.INSTANCE.map(getPageName());
        }

        public Map<String, Object> setCustomExtraJsInjectVariable() {
            return new LinkedHashMap();
        }

        public int cmsViewMarginTop() {
            int dimensionPixelSize;
            if (!CoinAbTestUtils.INSTANCE.enableV4H5()) {
                dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.x100);
            } else {
                dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.x150);
            }
            return dimensionPixelSize * (-1);
        }

        static /* synthetic */ void setHeaderImage$default(BaseCmsDetailFragment baseCmsDetailFragment, CmsName cmsName, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setHeaderImage");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            baseCmsDetailFragment.setHeaderImage(cmsName, str, str2);
        }

        private final void setHeaderImage(CmsName cmsName, String subjectSideUrl, String denominationSideUrl) {
            Bundle bundleOf = BundleKt.bundleOf(TuplesKt.to(LogEventArguments.ARG_INTEGER_1, 1), TuplesKt.to(LogEventArguments.ARG_STRING_1, String.valueOf(getItemId())), TuplesKt.to(LogEventArguments.ARG_STRING_2, cmsName.getUid()), TuplesKt.to("from", PageNameMapUtils.INSTANCE.map(getPageName())));
            RecognizeHeaderView recognizeHeaderView = this.recognizeHeaderView;
            if (recognizeHeaderView != null) {
                recognizeHeaderView.loadData(CollectionsKt.listOfNotNull((Object[]) new String[]{subjectSideUrl, denominationSideUrl}), cmsName, bundleOf, this.speciesUid, this.varietyUid);
            }
            NewRecognizeHeaderView newRecognizeHeaderView = this.newRecognizeHeaderView;
            if (newRecognizeHeaderView != null) {
                newRecognizeHeaderView.loadData(CollectionsKt.listOfNotNull((Object[]) new String[]{subjectSideUrl, denominationSideUrl}), cmsName, bundleOf, this.speciesUid, this.varietyUid);
            }
        }

        /* renamed from: shouldShowReferenceImages, reason: from getter */
        public boolean getShouldShowReferenceImages() {
            return this.shouldShowReferenceImages;
        }

        public final void updatePageData(String year, String speciesUid, String varietyUid) {
            this.year = year;
            this.speciesUid = speciesUid;
            this.varietyUid = varietyUid;
            CmsName cmsName = this.cmsName;
            if (cmsName != null) {
                Intrinsics.checkNotNull(cmsName);
                setHeaderImage(cmsName, this.userSubjectSideUrl, this.userDenominationSideUrl);
            }
        }

        public final Map<String, Object> getH5MyOfficialSet(CmsName cmsName, UserSeriesListItem userSeriesListItem, boolean isCollected) {
            String indexListUid;
            if (cmsName == null) {
                return new LinkedHashMap();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String preferredSeries = CmsNameExtKt.getPreferredSeries(cmsName);
            if (preferredSeries == null || preferredSeries.length() == 0) {
                return new LinkedHashMap();
            }
            String seriesTitle = CmsNameExtKt.getSeriesTitle(cmsName);
            if (seriesTitle != null) {
                linkedHashMap.put(Args.title, seriesTitle);
            }
            String seriesImageRecommendationPlaceholder = CmsNameExtKt.getSeriesImageRecommendationPlaceholder(cmsName);
            if (seriesImageRecommendationPlaceholder != null) {
                linkedHashMap.put("recommendationUrl", seriesImageRecommendationPlaceholder);
            }
            String seriesComposition = CmsNameExtKt.getSeriesComposition(cmsName);
            if (seriesComposition != null) {
                linkedHashMap.put("composition", seriesComposition);
            }
            String seriesShortDescription = CmsNameExtKt.getSeriesShortDescription(cmsName);
            if (seriesShortDescription != null) {
                linkedHashMap.put("desc", seriesShortDescription);
            }
            linkedHashMap.put("isCollected", Integer.valueOf(isCollected ? 1 : 0));
            if (userSeriesListItem != null && (indexListUid = userSeriesListItem.getIndexListUid()) != null) {
                linkedHashMap.put("indexlist", indexListUid);
            }
            linkedHashMap.put("isEmpty", Boolean.valueOf(userSeriesListItem == null));
            if (userSeriesListItem != null) {
                linkedHashMap.put("id", Long.valueOf(userSeriesListItem.getSeriesId()));
                linkedHashMap.put("total", Integer.valueOf(userSeriesListItem.getTotalNum()));
                linkedHashMap.put("current", Integer.valueOf(userSeriesListItem.getCurrentCount()));
                List<String> topSubjectSideUrls = userSeriesListItem.getTopSubjectSideUrls();
                if (topSubjectSideUrls == null) {
                    topSubjectSideUrls = CollectionsKt.emptyList();
                }
                linkedHashMap.put("images", topSubjectSideUrls);
            }
            return MapsKt.mutableMapOf(TuplesKt.to("myOfficialset", linkedHashMap));
        }

        public void openCamera(BaseJsMethod baseJsMethod, String scene) {
            Intrinsics.checkNotNullParameter(baseJsMethod, "baseJsMethod");
            baseJsMethod.openCamera(scene);
        }
    }
