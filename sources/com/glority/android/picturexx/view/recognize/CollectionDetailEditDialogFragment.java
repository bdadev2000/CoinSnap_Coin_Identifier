package com.glority.android.picturexx.view.recognize;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavOptions;
import androidx.navigation.compose.DialogNavigator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.webkit.ProxyConfig;
import com.bumptech.glide.Glide;
import com.glority.android.adapterhelper.BaseMultiItemQuickAdapter;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.cmsui2.bean.VarietyV2Entity;
import com.glority.android.cmsui2.bean.YearWithMintmarkV2;
import com.glority.android.cmsui2.entity.GradeItem;
import com.glority.android.cmsui2.util.CmsDataUtils;
import com.glority.android.cmsui2.util.GradingLevelScaleConvertor;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.database.entities.UserCustomSeriesItem;
import com.glority.android.picturexx.adapter.AddEntity;
import com.glority.android.picturexx.adapter.ImageEntity;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.FragmentEditCollectionDetailBinding;
import com.glority.android.picturexx.js.BusinessJsWebviewBottomSheetFragment;
import com.glority.android.picturexx.repository.CmsRepository;
import com.glority.android.picturexx.splash.MainActivity;
import com.glority.android.picturexx.utils.CoinConfigUtils;
import com.glority.android.picturexx.view.dialog.ChooseCustomSeriesDialog;
import com.glority.android.picturexx.view.dialog.GradeLevelDialog;
import com.glority.android.picturexx.view.dialog.VarietyTipsDialog;
import com.glority.android.ui.base.LocaleManager;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.android.xx.constants.SeriesChildType;
import com.glority.base.dialog.CustomDatePickerDialog;
import com.glority.base.entity.BaseMultiEntity;
import com.glority.base.utils.ImagePicker;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsImage;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsStaticUrl;
import com.glority.component.generatedAPI.kotlinAPI.cms.TaxonomyName;
import com.glority.utils.stability.LogUtils;
import com.glority.widget.GlTextView;
import com.glority.widget.alert.GlAlert;
import com.glority.widget.alert.GlAlertOnClickListener;
import com.glority.widget.imagepager.GlNormalImagePagerActivity;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.button.MaterialButton;
import com.picturecoin.generatedAPI.kotlinAPI.collection.Collection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.json.JSONObject;

/* compiled from: CollectionDetailEditDialogFragment.kt */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 y2\u00020\u00012\u00020\u0002:\u0002yzB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010;\u001a\u0002052\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J$\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010C2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\u001a\u0010D\u001a\u0002052\u0006\u0010E\u001a\u00020?2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\b\u0010F\u001a\u000205H\u0002J\u001c\u0010G\u001a\u0002052\u0006\u00103\u001a\u00020 2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010=H\u0002J\b\u0010I\u001a\u000205H\u0002J\u0014\u0010J\u001a\u0004\u0018\u00010 2\b\u0010K\u001a\u0004\u0018\u00010LH\u0002J\b\u0010M\u001a\u000205H\u0002J\u001a\u0010N\u001a\u0002052\u0006\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010 H\u0002J\b\u0010R\u001a\u000205H\u0002J\b\u0010S\u001a\u00020=H\u0002J\b\u0010T\u001a\u000205H\u0002J\u0012\u0010U\u001a\u0002052\b\u0010V\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010W\u001a\u000205H\u0002J\b\u0010X\u001a\u000205H\u0002J\u001e\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0Z2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u001e0&H\u0002J\u0018\u0010\\\u001a\u0004\u0018\u00010 2\u0006\u0010]\u001a\u00020\"H\u0082@¢\u0006\u0002\u0010^J\b\u0010_\u001a\u000205H\u0002J\b\u0010`\u001a\u000205H\u0002J\u0016\u0010a\u001a\u0002052\f\u0010b\u001a\b\u0012\u0004\u0012\u00020c0&H\u0002J\u0012\u0010d\u001a\u00020$2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\b\u0010e\u001a\u000205H\u0016J\u0010\u0010f\u001a\u0002052\u0006\u0010g\u001a\u00020$H\u0002J(\u0010h\u001a\u0002052\u0006\u0010g\u001a\u00020i2\u0006\u0010Q\u001a\u00020\u00152\u0006\u0010j\u001a\u00020\u00152\u0006\u0010k\u001a\u00020\u0015H\u0016J\b\u0010l\u001a\u000205H\u0016J\b\u0010m\u001a\u00020 H\u0002J\u0010\u0010n\u001a\u0002052\u0006\u0010g\u001a\u00020oH\u0016J\b\u0010p\u001a\u000205H\u0002J\u0010\u0010q\u001a\u0002052\u0006\u00104\u001a\u00020 H\u0002J\b\u0010r\u001a\u000205H\u0002J\b\u0010s\u001a\u000205H\u0016J$\u0010t\u001a\u0002052\u0014\u0010u\u001a\u0010\u0012\u0004\u0012\u00020w\u0012\u0006\u0012\u0004\u0018\u00010\u00060vH\u0082@¢\u0006\u0002\u0010xR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00060\u001aR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0015X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R5\u00100\u001a\u001d\u0012\u0013\u0012\u00110 ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020501X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u000e\u0010:\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006{"}, d2 = {"Lcom/glority/android/picturexx/view/recognize/CollectionDetailEditDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lcom/glority/base/dialog/CustomDatePickerDialog$Listener;", "<init>", "()V", "collection", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/Collection;", "getCollection", "()Lcom/picturecoin/generatedAPI/kotlinAPI/collection/Collection;", "setCollection", "(Lcom/picturecoin/generatedAPI/kotlinAPI/collection/Collection;)V", Args.cmsName, "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "getCmsName", "()Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "setCmsName", "(Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;)V", "itemId", "", "Ljava/lang/Long;", "nextPage", "", "originalCollectionClone", "binding", "Lcom/glority/android/picturexx/business/databinding/FragmentEditCollectionDetailBinding;", "adapter", "Lcom/glority/android/picturexx/view/recognize/CollectionDetailEditDialogFragment$ImageAdapter;", "MAX_IMAGE_COUNT", "imageList", "", "Lcom/glority/android/picturexx/adapter/ImageEntity;", "from", "", "headerImageUri", "Landroid/net/Uri;", "progress", "Landroid/app/Dialog;", "yearWithMintmarkList", "", "Lcom/glority/android/cmsui2/bean/YearWithMintmarkV2;", "imagePicker", "Lcom/glority/base/utils/ImagePicker;", "needChangePage", "", "getNeedChangePage", "()Z", "setNeedChangePage", "(Z)V", "statusCallback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "status", "", "getStatusCallback", "()Lkotlin/jvm/functions/Function1;", "setStatusCallback", "(Lkotlin/jvm/functions/Function1;)V", "userDismiss", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "view", "initListener", "logEvent", "bundle", "initData", "getFormatDate", "date", "Ljava/util/Date;", "initView", "setMintmark", "varietyV2Entity", "Lcom/glority/android/cmsui2/bean/VarietyV2Entity;", Args.year, "initCertainItemView", "getSendLogEventBundle", "saveData", "toCollectionDetail", "second", "toCollectionList", "toMainActivity", "uploadImage", "Lkotlinx/coroutines/flow/Flow;", "list", "uploadImageFile", "url", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setUpImageData", "checkSendBtEnable", "addRedStar", "listOf", "Lcom/glority/widget/GlTextView;", "onCreateDialog", "onStart", "setWhiteNavigationBar", DialogNavigator.NAME, "onDateChanged", "Lcom/glority/base/dialog/CustomDatePickerDialog;", "monthOfYear", "dayOfMonth", "onDestroy", "logPageName", "onDismiss", "Landroid/content/DialogInterface;", "businessDismiss", "callbackStatus", "updateVarietyTipUrl", "dismiss", "doAfterSaveCollection", "it", "Lkotlin/Pair;", "Lcom/glority/network/model/Status;", "(Lkotlin/Pair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ImageAdapter", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CollectionDetailEditDialogFragment extends BottomSheetDialogFragment implements CustomDatePickerDialog.Listener {
    public static final int NEXT_PAGE_COLLECTION_DETAIL = 1;
    public static final int NEXT_PAGE_COLLECTION_LIST = 2;
    public static final int NEXT_PAGE_NONE = 0;
    public static final String VARIETY_TIP = "variety_tip";
    private FragmentEditCollectionDetailBinding binding;
    private CmsName cmsName;
    private Collection collection;
    private Uri headerImageUri;
    private ImagePicker imagePicker;
    private Long itemId;
    private int nextPage;
    private Collection originalCollectionClone;
    private Dialog progress;
    private List<YearWithMintmarkV2> yearWithMintmarkList;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final ImageAdapter adapter = new ImageAdapter();
    private final int MAX_IMAGE_COUNT = 4;
    private List<ImageEntity> imageList = new ArrayList();
    private String from = "";
    private boolean needChangePage = true;
    private Function1<? super String, Unit> statusCallback = new Function1<String, Unit>() { // from class: com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment$statusCallback$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    };
    private boolean userDismiss = true;

    public final Collection getCollection() {
        return this.collection;
    }

    public final void setCollection(Collection collection) {
        this.collection = collection;
    }

    public final CmsName getCmsName() {
        return this.cmsName;
    }

    public final void setCmsName(CmsName cmsName) {
        this.cmsName = cmsName;
    }

    /* compiled from: CollectionDetailEditDialogFragment.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005J\u009d\u0001\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\u0002\u0010$J\\\u0010%\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u00052\b\u0010&\u001a\u0004\u0018\u00010\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/glority/android/picturexx/view/recognize/CollectionDetailEditDialogFragment$Companion;", "", "<init>", "()V", "VARIETY_TIP", "", "NEXT_PAGE_NONE", "", "NEXT_PAGE_COLLECTION_DETAIL", "NEXT_PAGE_COLLECTION_LIST", "editOpen", "Lcom/glority/android/picturexx/view/recognize/CollectionDetailEditDialogFragment;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "collection", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/Collection;", "nextPage", "from", Args.cmsName, "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", Args.genusUid, Args.yearUidType, "createOpen", "itemId", "", Args.uid, Args.year, "images", "", "seriesIndexUid", Args.denominationSideUrl, Args.subjectSideUrl, Args.speciesUid, Args.varietyUid, "gradeItem", "Lcom/glority/android/cmsui2/entity/GradeItem;", "(Landroidx/fragment/app/FragmentManager;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/glority/android/cmsui2/entity/GradeItem;)Lcom/glority/android/picturexx/view/recognize/CollectionDetailEditDialogFragment;", "createFromSeries", "yearUid", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ CollectionDetailEditDialogFragment editOpen$default(Companion companion, FragmentManager fragmentManager, Collection collection, int i, String str, CmsName cmsName, String str2, String str3, int i2, Object obj) {
            return companion.editOpen(fragmentManager, collection, i, str, cmsName, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : str3);
        }

        public final CollectionDetailEditDialogFragment editOpen(FragmentManager fragmentManager, Collection collection, int nextPage, String from, CmsName r8, String r9, String r10) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(collection, "collection");
            Intrinsics.checkNotNullParameter(from, "from");
            CollectionDetailEditDialogFragment collectionDetailEditDialogFragment = new CollectionDetailEditDialogFragment();
            collectionDetailEditDialogFragment.setCollection(collection);
            collectionDetailEditDialogFragment.setCmsName(r8);
            try {
                FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                collectionDetailEditDialogFragment.setArguments(BundleKt.bundleOf(TuplesKt.to(Args.itemId, collection.getItemId()), TuplesKt.to(Args.jump, Integer.valueOf(nextPage)), TuplesKt.to("from", from), TuplesKt.to(Args.genusUid, r9), TuplesKt.to(Args.yearUidType, r10)));
                collectionDetailEditDialogFragment.setNeedChangePage(false);
                Integer.valueOf(beginTransaction.add(collectionDetailEditDialogFragment, "CollectionDetailEditDialogFragment").commitAllowingStateLoss());
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
            return collectionDetailEditDialogFragment;
        }

        public static /* synthetic */ CollectionDetailEditDialogFragment createOpen$default(Companion companion, FragmentManager fragmentManager, Long l, String str, String str2, List list, int i, String str3, CmsName cmsName, String str4, String str5, String str6, String str7, String str8, GradeItem gradeItem, int i2, Object obj) {
            return companion.createOpen(fragmentManager, l, str, str2, list, i, str3, cmsName, str4, (i2 & 512) != 0 ? null : str5, (i2 & 1024) != 0 ? null : str6, (i2 & 2048) != 0 ? null : str7, (i2 & 4096) != 0 ? null : str8, (i2 & 8192) != 0 ? null : gradeItem);
        }

        public final CollectionDetailEditDialogFragment createOpen(FragmentManager fragmentManager, Long itemId, String r16, String r17, List<String> images, int nextPage, String from, CmsName r21, String seriesIndexUid, String r23, String r24, String r25, String r26, GradeItem gradeItem) {
            String str;
            YearWithMintmarkV2 yearWithMintmarkV2;
            VarietyV2Entity varietyV2Entity;
            VarietyV2Entity varietyV2Entity2;
            List<VarietyV2Entity> varietyList;
            Object obj;
            List<VarietyV2Entity> varietyList2;
            Object obj2;
            Object obj3;
            CmsImage mainImage;
            TaxonomyName name;
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(r16, "uid");
            Intrinsics.checkNotNullParameter(images, "images");
            Intrinsics.checkNotNullParameter(from, "from");
            Collection collection = new Collection(0, 1, null);
            collection.setItemId(itemId);
            collection.setImageUrl(CollectionsKt.toMutableList((java.util.Collection) images));
            String[] strArr = new String[1];
            if (r21 == null || (name = r21.getName()) == null || (str = name.getPreferredName()) == null) {
                str = "";
            }
            strArr[0] = str;
            collection.setNames(CollectionsKt.mutableListOf(strArr));
            collection.setUid(r16);
            collection.setSeriesIndexListUid(seriesIndexUid);
            collection.setDenominationSideUrl(r23);
            collection.setSubjectSideUrl(r24);
            collection.setYear(r17);
            collection.setSpeciesUid(r25);
            collection.setVarietyUid(r26);
            collection.setOriginalImageUrl((r21 == null || (mainImage = r21.getMainImage()) == null) ? null : mainImage.getImageUrl());
            if (r21 != null) {
                List<YearWithMintmarkV2> parseYearWithMintmarkV2 = CmsDataUtils.INSTANCE.parseYearWithMintmarkV2(r21);
                if (parseYearWithMintmarkV2 != null) {
                    Iterator<T> it = parseYearWithMintmarkV2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it.next();
                        if (Intrinsics.areEqual(((YearWithMintmarkV2) obj3).getYear(), r17)) {
                            break;
                        }
                    }
                    yearWithMintmarkV2 = (YearWithMintmarkV2) obj3;
                } else {
                    yearWithMintmarkV2 = null;
                }
                if (yearWithMintmarkV2 == null || (varietyList2 = yearWithMintmarkV2.getVarietyList()) == null) {
                    varietyV2Entity = null;
                } else {
                    Iterator<T> it2 = varietyList2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        if (Intrinsics.areEqual(((VarietyV2Entity) obj2).getVarietyUid(), r26)) {
                            break;
                        }
                    }
                    varietyV2Entity = (VarietyV2Entity) obj2;
                }
                if (varietyV2Entity != null) {
                    collection.setMintMark(varietyV2Entity.getMintmark());
                } else {
                    if (yearWithMintmarkV2 == null || (varietyList = yearWithMintmarkV2.getVarietyList()) == null) {
                        varietyV2Entity2 = null;
                    } else {
                        Iterator<T> it3 = varietyList.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it3.next();
                            if (Intrinsics.areEqual(((VarietyV2Entity) obj).getMintmark(), yearWithMintmarkV2.getDefaultMintMark())) {
                                break;
                            }
                        }
                        varietyV2Entity2 = (VarietyV2Entity) obj;
                    }
                    collection.setMintMark(varietyV2Entity2 != null ? varietyV2Entity2.getMintmark() : null);
                    collection.setVarietyUid(varietyV2Entity2 != null ? varietyV2Entity2.getVarietyUid() : null);
                    collection.setSpeciesUid(varietyV2Entity2 != null ? varietyV2Entity2.getSpeciesUid() : null);
                }
            }
            if (gradeItem != null && gradeItem.getShortNameId() != null) {
                collection.setFormula(gradeItem.getShortName(AppContext.INSTANCE.peekContext()));
            }
            return editOpen$default(this, fragmentManager, collection, nextPage, from, r21, null, null, 96, null);
        }

        public final CollectionDetailEditDialogFragment createFromSeries(FragmentManager fragmentManager, String r13, List<String> images, int nextPage, String from, CmsName r17, String seriesIndexUid, String yearUid, String r20) {
            String str;
            TaxonomyName name;
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(r13, "uid");
            Intrinsics.checkNotNullParameter(images, "images");
            Intrinsics.checkNotNullParameter(from, "from");
            Collection collection = new Collection(0, 1, null);
            collection.setImageUrl(CollectionsKt.toMutableList((java.util.Collection) images));
            String[] strArr = new String[1];
            if (r17 == null || (name = r17.getName()) == null || (str = name.getPreferredName()) == null) {
                str = "";
            }
            strArr[0] = str;
            collection.setNames(CollectionsKt.mutableListOf(strArr));
            collection.setUid(r13);
            collection.setSeriesIndexListUid(seriesIndexUid);
            return editOpen(fragmentManager, collection, nextPage, from, r17, yearUid, r20);
        }
    }

    public final boolean getNeedChangePage() {
        return this.needChangePage;
    }

    public final void setNeedChangePage(boolean z) {
        this.needChangePage = z;
    }

    public final Function1<String, Unit> getStatusCallback() {
        return this.statusCallback;
    }

    public final void setStatusCallback(Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.statusCallback = function1;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        this.imagePicker = new ImagePicker(this, 1);
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup r4, Bundle savedInstanceState) {
        String str;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Bundle arguments = getArguments();
        this.nextPage = arguments != null ? arguments.getInt(Args.jump) : 0;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str = arguments2.getString("from")) == null) {
            str = "";
        }
        this.from = str;
        CmsName cmsName = this.cmsName;
        if (cmsName != null) {
            this.yearWithMintmarkList = CmsDataUtils.INSTANCE.parseYearWithMintmarkV2(cmsName);
        }
        Collection collection = this.collection;
        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding = null;
        if (collection == null) {
            collection = new Collection(0, 1, null);
        }
        this.originalCollectionClone = collection;
        this.itemId = Long.valueOf(requireArguments().getLong(Args.itemId));
        Collection collection2 = this.originalCollectionClone;
        if (collection2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("originalCollectionClone");
            collection2 = null;
        }
        collection2.setItemId(this.itemId);
        FragmentEditCollectionDetailBinding inflate = FragmentEditCollectionDetailBinding.inflate(inflater);
        this.binding = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentEditCollectionDetailBinding = inflate;
        }
        View root = fragmentEditCollectionDetailBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        initData();
        initListener();
        initCertainItemView();
        logEvent$default(this, LogEvents.addcollectionpopview_show, null, 2, null);
    }

    private final void initListener() {
        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding = this.binding;
        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding2 = null;
        if (fragmentEditCollectionDetailBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentEditCollectionDetailBinding = null;
        }
        fragmentEditCollectionDetailBinding.saveBt.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollectionDetailEditDialogFragment.initListener$lambda$1(CollectionDetailEditDialogFragment.this, view);
            }
        });
        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding3 = this.binding;
        if (fragmentEditCollectionDetailBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentEditCollectionDetailBinding3 = null;
        }
        fragmentEditCollectionDetailBinding3.clAcquisitionDate.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollectionDetailEditDialogFragment.initListener$lambda$2(CollectionDetailEditDialogFragment.this, view);
            }
        });
        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding4 = this.binding;
        if (fragmentEditCollectionDetailBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentEditCollectionDetailBinding4 = null;
        }
        fragmentEditCollectionDetailBinding4.ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollectionDetailEditDialogFragment.initListener$lambda$3(CollectionDetailEditDialogFragment.this, view);
            }
        });
        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding5 = this.binding;
        if (fragmentEditCollectionDetailBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentEditCollectionDetailBinding5 = null;
        }
        fragmentEditCollectionDetailBinding5.containerV.getLayoutTransition().enableTransitionType(4);
        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding6 = this.binding;
        if (fragmentEditCollectionDetailBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentEditCollectionDetailBinding6 = null;
        }
        fragmentEditCollectionDetailBinding6.addMoreBt.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollectionDetailEditDialogFragment.initListener$lambda$4(CollectionDetailEditDialogFragment.this, view);
            }
        });
        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding7 = this.binding;
        if (fragmentEditCollectionDetailBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentEditCollectionDetailBinding7 = null;
        }
        fragmentEditCollectionDetailBinding7.mintMarkLl.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollectionDetailEditDialogFragment.initListener$lambda$5(CollectionDetailEditDialogFragment.this, view);
            }
        });
        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding8 = this.binding;
        if (fragmentEditCollectionDetailBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentEditCollectionDetailBinding8 = null;
        }
        LinearLayout gradeLl = fragmentEditCollectionDetailBinding8.gradeLl;
        Intrinsics.checkNotNullExpressionValue(gradeLl, "gradeLl");
        ViewExtensionsKt.setSingleClickListener$default(gradeLl, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment$initListener$6
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding9;
                Intrinsics.checkNotNullParameter(it, "it");
                List<? extends GradeItem> list = GradingLevelScaleConvertor.INSTANCE.getTypeLevelMap().get(GradingLevelScaleConvertor.INSTANCE.getDefaultScaleType(AppViewModel.INSTANCE.getInstance().getCountryCode()));
                List<? extends GradeItem> list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    return;
                }
                GradeLevelDialog gradeLevelDialog = GradeLevelDialog.INSTANCE;
                Context context = it.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                fragmentEditCollectionDetailBinding9 = CollectionDetailEditDialogFragment.this.binding;
                if (fragmentEditCollectionDetailBinding9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentEditCollectionDetailBinding9 = null;
                }
                String obj = fragmentEditCollectionDetailBinding9.gradeEt.getText().toString();
                final CollectionDetailEditDialogFragment collectionDetailEditDialogFragment = CollectionDetailEditDialogFragment.this;
                gradeLevelDialog.open(context, list, obj, new Function1<String, Unit>() { // from class: com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment$initListener$6.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                        invoke2(str);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String str) {
                        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding10;
                        fragmentEditCollectionDetailBinding10 = CollectionDetailEditDialogFragment.this.binding;
                        if (fragmentEditCollectionDetailBinding10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            fragmentEditCollectionDetailBinding10 = null;
                        }
                        fragmentEditCollectionDetailBinding10.gradeEt.setText(str);
                    }
                });
            }
        }, 1, (Object) null);
        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding9 = this.binding;
        if (fragmentEditCollectionDetailBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentEditCollectionDetailBinding9 = null;
        }
        LinearLayout seriesLl = fragmentEditCollectionDetailBinding9.seriesLl;
        Intrinsics.checkNotNullExpressionValue(seriesLl, "seriesLl");
        ViewExtensionsKt.setSingleClickListener$default(seriesLl, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment$initListener$7
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                String str;
                Collection collection;
                String str2;
                Intrinsics.checkNotNullParameter(it, "it");
                CollectionDetailEditDialogFragment collectionDetailEditDialogFragment = CollectionDetailEditDialogFragment.this;
                str = collectionDetailEditDialogFragment.from;
                collectionDetailEditDialogFragment.logEvent(LogEvents.collectionedit_customseries_click, BundleKt.bundleOf(TuplesKt.to("from", str)));
                ChooseCustomSeriesDialog.Companion companion = ChooseCustomSeriesDialog.Companion;
                FragmentManager childFragmentManager = CollectionDetailEditDialogFragment.this.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                collection = CollectionDetailEditDialogFragment.this.originalCollectionClone;
                if (collection == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("originalCollectionClone");
                    collection = null;
                }
                Integer customSeriesId = collection.getCustomSeriesId();
                str2 = CollectionDetailEditDialogFragment.this.from;
                final CollectionDetailEditDialogFragment collectionDetailEditDialogFragment2 = CollectionDetailEditDialogFragment.this;
                companion.open(childFragmentManager, customSeriesId, str2, new Function1<UserCustomSeriesItem, Unit>() { // from class: com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment$initListener$7.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(UserCustomSeriesItem userCustomSeriesItem) {
                        invoke2(userCustomSeriesItem);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(UserCustomSeriesItem userCustomSeriesItem) {
                        Collection collection2;
                        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding10;
                        Collection collection3;
                        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding11;
                        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding12 = null;
                        if (userCustomSeriesItem != null) {
                            collection3 = CollectionDetailEditDialogFragment.this.originalCollectionClone;
                            if (collection3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("originalCollectionClone");
                                collection3 = null;
                            }
                            collection3.setCustomSeriesId(Integer.valueOf(userCustomSeriesItem.getCustomSeriesId()));
                            fragmentEditCollectionDetailBinding11 = CollectionDetailEditDialogFragment.this.binding;
                            if (fragmentEditCollectionDetailBinding11 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                fragmentEditCollectionDetailBinding12 = fragmentEditCollectionDetailBinding11;
                            }
                            fragmentEditCollectionDetailBinding12.seriesEt.setText(userCustomSeriesItem.getTitle());
                            return;
                        }
                        collection2 = CollectionDetailEditDialogFragment.this.originalCollectionClone;
                        if (collection2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("originalCollectionClone");
                            collection2 = null;
                        }
                        collection2.setCustomSeriesId(null);
                        fragmentEditCollectionDetailBinding10 = CollectionDetailEditDialogFragment.this.binding;
                        if (fragmentEditCollectionDetailBinding10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            fragmentEditCollectionDetailBinding10 = null;
                        }
                        fragmentEditCollectionDetailBinding10.seriesEt.setText((CharSequence) null);
                    }
                });
            }
        }, 1, (Object) null);
        this.adapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() { // from class: com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment$initListener$8
            private long currentTime = System.currentTimeMillis();

            @Override // com.glority.android.adapterhelper.BaseQuickAdapter.OnItemChildClickListener
            public void onItemChildClick(BaseQuickAdapter<?, ?> adapter, View view, int position) {
                ImagePicker imagePicker;
                List list;
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "view");
                if (System.currentTimeMillis() - this.currentTime < 500) {
                    return;
                }
                this.currentTime = System.currentTimeMillis();
                int id = view.getId();
                ImagePicker imagePicker2 = null;
                if (id == R.id.iv_close1) {
                    CollectionDetailEditDialogFragment.logEvent$default(CollectionDetailEditDialogFragment.this, LogEvents.addcollectionpopview_imagedelete_click, null, 2, null);
                    Object orNull = CollectionsKt.getOrNull(adapter.getData(), position);
                    ImageEntity imageEntity = orNull instanceof ImageEntity ? (ImageEntity) orNull : null;
                    if (imageEntity == null) {
                        return;
                    }
                    list = CollectionDetailEditDialogFragment.this.imageList;
                    list.remove(imageEntity);
                    CollectionDetailEditDialogFragment.this.setUpImageData();
                    return;
                }
                if (id == R.id.iv) {
                    List<?> data = adapter.getData();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : data) {
                        if (obj instanceof ImageEntity) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = arrayList;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((ImageEntity) it.next()).getUrl().toString());
                    }
                    String[] strArr = (String[]) arrayList3.toArray(new String[0]);
                    GlNormalImagePagerActivity.Companion companion = GlNormalImagePagerActivity.Companion;
                    Context context = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    companion.open(context, strArr, position);
                    return;
                }
                if (id == R.id.add_bt) {
                    CollectionDetailEditDialogFragment.logEvent$default(CollectionDetailEditDialogFragment.this, LogEvents.addcollectionpopview_imageadd_click, null, 2, null);
                    imagePicker = CollectionDetailEditDialogFragment.this.imagePicker;
                    if (imagePicker == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("imagePicker");
                    } else {
                        imagePicker2 = imagePicker;
                    }
                    final CollectionDetailEditDialogFragment collectionDetailEditDialogFragment = CollectionDetailEditDialogFragment.this;
                    imagePicker2.pick(new ImagePicker.OnImageSelectedListener() { // from class: com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment$initListener$8$onItemChildClick$1
                        @Override // com.glority.base.utils.ImagePicker.OnImageSelectedListener
                        public void onImageSelected(List<? extends Uri> uris) {
                            List list2;
                            Intrinsics.checkNotNullParameter(uris, "uris");
                            list2 = CollectionDetailEditDialogFragment.this.imageList;
                            List<? extends Uri> list3 = uris;
                            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                            Iterator<T> it2 = list3.iterator();
                            while (it2.hasNext()) {
                                arrayList4.add(new ImageEntity((Uri) it2.next()));
                            }
                            list2.addAll(arrayList4);
                            CollectionDetailEditDialogFragment.this.setUpImageData();
                        }
                    });
                }
            }
        });
        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding10 = this.binding;
        if (fragmentEditCollectionDetailBinding10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentEditCollectionDetailBinding10 = null;
        }
        GlTextView varietyTv = fragmentEditCollectionDetailBinding10.varietyTv;
        Intrinsics.checkNotNullExpressionValue(varietyTv, "varietyTv");
        ViewExtensionsKt.setSingleClickListener$default(varietyTv, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment$initListener$9
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding11;
                Intrinsics.checkNotNullParameter(it, "it");
                CollectionDetailEditDialogFragment.this.logEvent(LogEvents.variety_tips_click, BundleKt.bundleOf(TuplesKt.to("from", "collectionpopup")));
                BusinessJsWebviewBottomSheetFragment.Companion companion = BusinessJsWebviewBottomSheetFragment.Companion;
                FragmentActivity requireActivity = CollectionDetailEditDialogFragment.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                CmsStaticUrl staticUrlMessageByCache = CmsRepository.INSTANCE.getStaticUrlMessageByCache(null, CollectionDetailEditDialogFragment.VARIETY_TIP);
                String lightUrl = staticUrlMessageByCache != null ? staticUrlMessageByCache.getLightUrl() : null;
                fragmentEditCollectionDetailBinding11 = CollectionDetailEditDialogFragment.this.binding;
                if (fragmentEditCollectionDetailBinding11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentEditCollectionDetailBinding11 = null;
                }
                companion.open(requireActivity, lightUrl, fragmentEditCollectionDetailBinding11.varietyTv.getText().toString(), null);
            }
        }, 1, (Object) null);
        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding11 = this.binding;
        if (fragmentEditCollectionDetailBinding11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentEditCollectionDetailBinding2 = fragmentEditCollectionDetailBinding11;
        }
        TextView priceUnitTv = fragmentEditCollectionDetailBinding2.priceUnitTv;
        Intrinsics.checkNotNullExpressionValue(priceUnitTv, "priceUnitTv");
        ViewExtensionsKt.setSingleClickListener$default(priceUnitTv, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment$initListener$10
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                CollectionDetailEditDialogFragment.this.logEvent(LogEvents.collectionedit_currencysymbol_click, BundleKt.bundleOf(TuplesKt.to(LogEventArguments.ARG_STRING_1, CoinConfigUtils.INSTANCE.getCountryCode())));
                Context context = it.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                GlAlert.Builder message = new GlAlert.Builder(context, GlAlert.DialogStyle.CUSTOM, 0, 4, null).showCloseIcon().setMessage(R.string.identifyresult_addtosetpopup_caption_switchcurrency);
                int i = R.string.text_ok;
                final CollectionDetailEditDialogFragment collectionDetailEditDialogFragment = CollectionDetailEditDialogFragment.this;
                GlAlert.Builder.setPositiveButton$default(message, i, new GlAlertOnClickListener() { // from class: com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment$initListener$10.1
                    @Override // com.glority.widget.alert.GlAlertOnClickListener
                    public void onClick(AlertDialog glAlert) {
                        Intrinsics.checkNotNullParameter(glAlert, "glAlert");
                        CollectionDetailEditDialogFragment.logEvent$default(CollectionDetailEditDialogFragment.this, LogEvents.currencysymboldialog_ok_click, null, 2, null);
                        glAlert.dismiss();
                    }
                }, (GlAlert.ButtonStyle) null, 4, (Object) null).show();
            }
        }, 1, (Object) null);
    }

    public static final void initListener$lambda$1(CollectionDetailEditDialogFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.logEvent(LogEvents.addcollectionpopview_send_click, this$0.getSendLogEventBundle());
        this$0.saveData();
    }

    public static final void initListener$lambda$2(CollectionDetailEditDialogFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        new CustomDatePickerDialog(context).show(this$0);
    }

    public static final void initListener$lambda$3(CollectionDetailEditDialogFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        logEvent$default(this$0, LogEvents.addcollectionpopview_close_click, null, 2, null);
        Dialog dialog = this$0.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public static final void initListener$lambda$4(CollectionDetailEditDialogFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding = this$0.binding;
        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding2 = null;
        if (fragmentEditCollectionDetailBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentEditCollectionDetailBinding = null;
        }
        LinearLayout moreInfoLl = fragmentEditCollectionDetailBinding.moreInfoLl;
        Intrinsics.checkNotNullExpressionValue(moreInfoLl, "moreInfoLl");
        moreInfoLl.setVisibility(0);
        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding3 = this$0.binding;
        if (fragmentEditCollectionDetailBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentEditCollectionDetailBinding2 = fragmentEditCollectionDetailBinding3;
        }
        MaterialButton addMoreBt = fragmentEditCollectionDetailBinding2.addMoreBt;
        Intrinsics.checkNotNullExpressionValue(addMoreBt, "addMoreBt");
        addMoreBt.setVisibility(8);
        this$0.logEvent(LogEvents.addcollectionpopview_more_click, BundleKt.bundleOf(TuplesKt.to("from", this$0.from)));
    }

    public static final void initListener$lambda$5(CollectionDetailEditDialogFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VarietyTipsDialog varietyTipsDialog = VarietyTipsDialog.INSTANCE;
        FragmentActivity requireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ArrayList arrayList = this$0.yearWithMintmarkList;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        Collection collection = this$0.originalCollectionClone;
        if (collection == null) {
            Intrinsics.throwUninitializedPropertyAccessException("originalCollectionClone");
            collection = null;
        }
        varietyTipsDialog.show(requireActivity, arrayList, collection.getVarietyUid(), new Function2<String, VarietyV2Entity, Unit>() { // from class: com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment$initListener$5$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, VarietyV2Entity varietyV2Entity) {
                invoke2(str, varietyV2Entity);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String year, VarietyV2Entity variety) {
                Intrinsics.checkNotNullParameter(year, "year");
                Intrinsics.checkNotNullParameter(variety, "variety");
                CollectionDetailEditDialogFragment.this.setMintmark(variety, year);
                CollectionDetailEditDialogFragment.this.checkSendBtEnable();
            }
        });
    }

    public static /* synthetic */ void logEvent$default(CollectionDetailEditDialogFragment collectionDetailEditDialogFragment, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        collectionDetailEditDialogFragment.logEvent(str, bundle);
    }

    public final void logEvent(String name, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        if (bundle == null || !bundle.containsKey("from")) {
            bundle2.putString("from", this.from);
        }
        new LogEventRequest(name, bundle2).post();
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a4, code lost:
    
        if (r4 != null) goto L266;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void initData() {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment.initData():void");
    }

    private final String getFormatDate(Date date) {
        Collection collection = this.originalCollectionClone;
        if (collection == null) {
            Intrinsics.throwUninitializedPropertyAccessException("originalCollectionClone");
            collection = null;
        }
        collection.setAcquisitionDate(date);
        if (date == null) {
            return null;
        }
        return new SimpleDateFormat("dd-MM-yyyy", LocaleManager.getLocale(getResources())).format(date);
    }

    private final void initView() {
        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding = null;
        try {
            ImageAdapter imageAdapter = this.adapter;
            FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding2 = this.binding;
            if (fragmentEditCollectionDetailBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentEditCollectionDetailBinding2 = null;
            }
            RecyclerView rv = fragmentEditCollectionDetailBinding2.rv;
            Intrinsics.checkNotNullExpressionValue(rv, "rv");
            imageAdapter.bindToRecyclerView(rv);
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
        if (Intrinsics.areEqual(this.from, LogEvents.collectionLabel)) {
            FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding3 = this.binding;
            if (fragmentEditCollectionDetailBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentEditCollectionDetailBinding3 = null;
            }
            fragmentEditCollectionDetailBinding3.title.setText(R.string.collection_detail_popup_title);
            FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding4 = this.binding;
            if (fragmentEditCollectionDetailBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentEditCollectionDetailBinding4 = null;
            }
            LinearLayout moreInfoLl = fragmentEditCollectionDetailBinding4.moreInfoLl;
            Intrinsics.checkNotNullExpressionValue(moreInfoLl, "moreInfoLl");
            moreInfoLl.setVisibility(0);
            FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding5 = this.binding;
            if (fragmentEditCollectionDetailBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentEditCollectionDetailBinding5 = null;
            }
            MaterialButton addMoreBt = fragmentEditCollectionDetailBinding5.addMoreBt;
            Intrinsics.checkNotNullExpressionValue(addMoreBt, "addMoreBt");
            addMoreBt.setVisibility(8);
        } else {
            FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding6 = this.binding;
            if (fragmentEditCollectionDetailBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentEditCollectionDetailBinding6 = null;
            }
            fragmentEditCollectionDetailBinding6.title.setText(R.string.identify_result_add);
            FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding7 = this.binding;
            if (fragmentEditCollectionDetailBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentEditCollectionDetailBinding7 = null;
            }
            LinearLayout moreInfoLl2 = fragmentEditCollectionDetailBinding7.moreInfoLl;
            Intrinsics.checkNotNullExpressionValue(moreInfoLl2, "moreInfoLl");
            moreInfoLl2.setVisibility(8);
            FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding8 = this.binding;
            if (fragmentEditCollectionDetailBinding8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentEditCollectionDetailBinding8 = null;
            }
            MaterialButton addMoreBt2 = fragmentEditCollectionDetailBinding8.addMoreBt;
            Intrinsics.checkNotNullExpressionValue(addMoreBt2, "addMoreBt");
            addMoreBt2.setVisibility(0);
        }
        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding9 = this.binding;
        if (fragmentEditCollectionDetailBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentEditCollectionDetailBinding = fragmentEditCollectionDetailBinding9;
        }
        addRedStar(CollectionsKt.listOf(fragmentEditCollectionDetailBinding.varietyTv));
    }

    public final void setMintmark(VarietyV2Entity varietyV2Entity, String r6) {
        Collection collection = this.originalCollectionClone;
        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding = null;
        if (collection == null) {
            Intrinsics.throwUninitializedPropertyAccessException("originalCollectionClone");
            collection = null;
        }
        collection.setSpeciesUid(varietyV2Entity.getSpeciesUid());
        Collection collection2 = this.originalCollectionClone;
        if (collection2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("originalCollectionClone");
            collection2 = null;
        }
        collection2.setVarietyUid(varietyV2Entity.getVarietyUid());
        Collection collection3 = this.originalCollectionClone;
        if (collection3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("originalCollectionClone");
            collection3 = null;
        }
        collection3.setMintMark(varietyV2Entity.getMintmark());
        Collection collection4 = this.originalCollectionClone;
        if (collection4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("originalCollectionClone");
            collection4 = null;
        }
        collection4.setYear(r6);
        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding2 = this.binding;
        if (fragmentEditCollectionDetailBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentEditCollectionDetailBinding = fragmentEditCollectionDetailBinding2;
        }
        fragmentEditCollectionDetailBinding.varietyEt.setText(r6 + "-" + varietyV2Entity.getMintmarkNoYear());
    }

    private final void initCertainItemView() {
        YearWithMintmarkV2 yearWithMintmarkV2;
        VarietyV2Entity varietyV2Entity;
        String mintmark;
        Object obj;
        List<YearWithMintmarkV2> list;
        Object obj2;
        VarietyV2Entity varietyV2Entity2;
        Object obj3;
        if (Intrinsics.areEqual(this.from, LogEvents.seriesdetail)) {
            Bundle arguments = getArguments();
            FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding = null;
            String string = arguments != null ? arguments.getString(Args.yearUidType) : null;
            Bundle arguments2 = getArguments();
            String string2 = arguments2 != null ? arguments2.getString(Args.genusUid) : null;
            String str = string2;
            if (str != null && str.length() != 0) {
                if (!Intrinsics.areEqual(string, SeriesChildType.VARIETY.getValue()) || (list = this.yearWithMintmarkList) == null) {
                    yearWithMintmarkV2 = null;
                } else {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        List<VarietyV2Entity> varietyList = ((YearWithMintmarkV2) obj2).getVarietyList();
                        if (varietyList != null) {
                            Iterator<T> it2 = varietyList.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj3 = null;
                                    break;
                                } else {
                                    obj3 = it2.next();
                                    if (Intrinsics.areEqual(((VarietyV2Entity) obj3).getVarietyUid(), string2)) {
                                        break;
                                    }
                                }
                            }
                            varietyV2Entity2 = (VarietyV2Entity) obj3;
                        } else {
                            varietyV2Entity2 = null;
                        }
                        if (varietyV2Entity2 != null) {
                            break;
                        }
                    }
                    yearWithMintmarkV2 = (YearWithMintmarkV2) obj2;
                }
                if (yearWithMintmarkV2 != null) {
                    List<VarietyV2Entity> varietyList2 = yearWithMintmarkV2.getVarietyList();
                    if (varietyList2 != null) {
                        Iterator<T> it3 = varietyList2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj = null;
                                break;
                            } else {
                                obj = it3.next();
                                if (Intrinsics.areEqual(((VarietyV2Entity) obj).getVarietyUid(), string2)) {
                                    break;
                                }
                            }
                        }
                        varietyV2Entity = (VarietyV2Entity) obj;
                    } else {
                        varietyV2Entity = null;
                    }
                    if (varietyV2Entity != null && (mintmark = varietyV2Entity.getMintmark()) != null && mintmark.length() != 0) {
                        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding2 = this.binding;
                        if (fragmentEditCollectionDetailBinding2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            fragmentEditCollectionDetailBinding2 = null;
                        }
                        fragmentEditCollectionDetailBinding2.varietyEt.setText(varietyV2Entity.getMintmark());
                        Collection collection = this.originalCollectionClone;
                        if (collection == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("originalCollectionClone");
                            collection = null;
                        }
                        collection.setSpeciesUid(varietyV2Entity.getSpeciesUid());
                        Collection collection2 = this.originalCollectionClone;
                        if (collection2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("originalCollectionClone");
                            collection2 = null;
                        }
                        collection2.setVarietyUid(varietyV2Entity.getVarietyUid());
                        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding3 = this.binding;
                        if (fragmentEditCollectionDetailBinding3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            fragmentEditCollectionDetailBinding3 = null;
                        }
                        fragmentEditCollectionDetailBinding3.varietyEt.setAlpha(0.5f);
                        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding4 = this.binding;
                        if (fragmentEditCollectionDetailBinding4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            fragmentEditCollectionDetailBinding4 = null;
                        }
                        ImageView mintmarkIv = fragmentEditCollectionDetailBinding4.mintmarkIv;
                        Intrinsics.checkNotNullExpressionValue(mintmarkIv, "mintmarkIv");
                        mintmarkIv.setVisibility(8);
                        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding5 = this.binding;
                        if (fragmentEditCollectionDetailBinding5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            fragmentEditCollectionDetailBinding = fragmentEditCollectionDetailBinding5;
                        }
                        fragmentEditCollectionDetailBinding.mintMarkLl.setEnabled(false);
                    }
                }
            }
            checkSendBtEnable();
        }
    }

    private final Bundle getSendLogEventBundle() {
        JSONObject jSONObject = new JSONObject();
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        Collection collection = null;
        try {
            FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding = this.binding;
            if (fragmentEditCollectionDetailBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentEditCollectionDetailBinding = null;
            }
            jSONObject.put("save_collection_name", StringsKt.trim((CharSequence) fragmentEditCollectionDetailBinding.nameEt.getText().toString()).toString());
            FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding2 = this.binding;
            if (fragmentEditCollectionDetailBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentEditCollectionDetailBinding2 = null;
            }
            jSONObject.put("save_collection_date", StringsKt.trim((CharSequence) fragmentEditCollectionDetailBinding2.acquisitionEt.getText().toString()).toString());
            FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding3 = this.binding;
            if (fragmentEditCollectionDetailBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentEditCollectionDetailBinding3 = null;
            }
            jSONObject.put("save_collection_price", StringsKt.trim((CharSequence) fragmentEditCollectionDetailBinding3.valueEt.getText().toString()).toString());
            FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding4 = this.binding;
            if (fragmentEditCollectionDetailBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentEditCollectionDetailBinding4 = null;
            }
            jSONObject.put("save_collection_note", StringsKt.trim((CharSequence) fragmentEditCollectionDetailBinding4.notesEt.getText().toString()).toString());
            jSONObject.put("save_collection_photo", String.valueOf(this.adapter.getData().size()));
            FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding5 = this.binding;
            if (fragmentEditCollectionDetailBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentEditCollectionDetailBinding5 = null;
            }
            jSONObject.put("save_collection_grade", StringsKt.trim((CharSequence) fragmentEditCollectionDetailBinding5.gradeEt.getText().toString()).toString());
            jSONObject2 = jSONObject.toString();
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to(LogEventArguments.ARG_STRING_1, this.itemId);
        Collection collection2 = this.originalCollectionClone;
        if (collection2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("originalCollectionClone");
        } else {
            collection = collection2;
        }
        pairArr[1] = TuplesKt.to(LogEventArguments.ARG_STRING_2, collection.getUid());
        pairArr[2] = TuplesKt.to("content", jSONObject2);
        return LogEventArgumentsKt.logEventBundleOf(pairArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void saveData() {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment.saveData():void");
    }

    private final void toCollectionDetail(Collection second) {
        if (second != null) {
            ViewExtensionsKt.navigate$default(this, R.id.action_meCmsDetailFragment_to_collectCmsDetailFragment, BundleKt.bundleOf(TuplesKt.to(Args.itemId, second.getItemId()), TuplesKt.to(Args.uid, second.getUid()), TuplesKt.to("from", this.from), TuplesKt.to(Args.collectionId, second.getCollectionId()), TuplesKt.to(Args.speciesUid, second.getSpeciesUid()), TuplesKt.to(Args.varietyUid, second.getVarietyUid())), new NavOptions.Builder().setPopUpTo(R.id.mainFragment, false, false).build(), null, 8, null);
        }
    }

    private final void toCollectionList() {
        toMainActivity();
    }

    private final void toMainActivity() {
        try {
            AppContext.INSTANCE.peekContext().startActivity(new Intent(AppContext.INSTANCE.peekContext(), (Class<?>) MainActivity.class));
        } catch (Throwable unused) {
            Context peekContext = AppContext.INSTANCE.peekContext();
            Intent intent = new Intent(AppContext.INSTANCE.peekContext(), (Class<?>) MainActivity.class);
            intent.addFlags(268435456);
            peekContext.startActivity(intent);
        }
    }

    public final Flow<String> uploadImage(List<ImageEntity> list) {
        return FlowKt.flow(new CollectionDetailEditDialogFragment$uploadImage$1(list, this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object uploadImageFile(android.net.Uri r12, kotlin.coroutines.Continuation<? super java.lang.String> r13) {
        /*
            r11 = this;
            kotlin.coroutines.SafeContinuation r0 = new kotlin.coroutines.SafeContinuation
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r13)
            r0.<init>(r1)
            r1 = r0
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.String r2 = r12.toString()
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 != 0) goto L1e
            goto L30
        L1e:
            java.lang.String r2 = r12.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r4 = 2
            r5 = 0
            java.lang.String r6 = "http"
            r7 = 0
            boolean r2 = kotlin.text.StringsKt.startsWith$default(r2, r6, r7, r4, r5)
            if (r2 == 0) goto L3e
        L30:
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.String r12 = r12.toString()
            java.lang.Object r12 = kotlin.Result.m8274constructorimpl(r12)
            r1.resumeWith(r12)
            goto L77
        L3e:
            com.glority.android.core.route.fileupload.FileUploadRequest r10 = new com.glority.android.core.route.fileupload.FileUploadRequest
            java.lang.String r2 = com.glority.utils.store.FileUtils.getFilePath(r12)
            if (r2 != 0) goto L4f
            java.lang.String r12 = r12.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r3)
            r3 = r12
            goto L50
        L4f:
            r3 = r2
        L50:
            com.glority.android.base.aws.s3.Scope r12 = com.glority.android.base.aws.s3.Scope.COLLECTION_ORIGINAL
            java.lang.String r4 = r12.getValue()
            com.glority.android.picturexx.s3.ItemType r12 = com.glority.android.picturexx.s3.ItemType.ITEM_ADD_COLLECTION_DETAIL
            java.lang.String r5 = r12.getItemType()
            com.glority.component.generatedAPI.kotlinAPI.enums.PhotoFrom r6 = com.glority.component.generatedAPI.kotlinAPI.enums.PhotoFrom.ALBUM
            r8 = 16
            r9 = 0
            r7 = 0
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment$uploadImageFile$2$1 r12 = new com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment$uploadImageFile$2$1
            r12.<init>()
            io.reactivex.functions.Consumer r12 = (io.reactivex.functions.Consumer) r12
            com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment$uploadImageFile$2$2 r2 = new com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment$uploadImageFile$2$2
            r2.<init>()
            io.reactivex.functions.Consumer r2 = (io.reactivex.functions.Consumer) r2
            r10.subscribe(r12, r2)
        L77:
            java.lang.Object r12 = r0.getOrThrow()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r12 != r0) goto L84
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r13)
        L84:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment.uploadImageFile(android.net.Uri, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void setUpImageData() {
        ArrayList arrayList = new ArrayList(this.imageList);
        if (arrayList.size() < this.MAX_IMAGE_COUNT) {
            arrayList.add(new AddEntity());
        }
        this.adapter.setNewDiffData(new BaseMultiEntity.BaseMultiDiffCallback(arrayList) { // from class: com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment$setUpImageData$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(arrayList);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.glority.base.entity.BaseMultiEntity.BaseMultiDiffCallback, com.glority.android.adapterhelper.diff.BaseQuickDiffCallback
            public boolean areItemsTheSame(BaseMultiEntity oldItem, BaseMultiEntity newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return super.areItemsTheSame(oldItem, newItem) && !((oldItem instanceof ImageEntity) && (newItem instanceof ImageEntity) && !Intrinsics.areEqual(((ImageEntity) oldItem).getUrl(), ((ImageEntity) newItem).getUrl()));
            }
        });
    }

    public final void checkSendBtEnable() {
        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding = this.binding;
        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding2 = null;
        if (fragmentEditCollectionDetailBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentEditCollectionDetailBinding = null;
        }
        CharSequence text = fragmentEditCollectionDetailBinding.varietyEt.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        boolean z = text.length() == 0;
        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding3 = this.binding;
        if (fragmentEditCollectionDetailBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentEditCollectionDetailBinding3 = null;
        }
        fragmentEditCollectionDetailBinding3.saveBt.setEnabled(!z);
        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding4 = this.binding;
        if (fragmentEditCollectionDetailBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentEditCollectionDetailBinding4 = null;
        }
        MaterialButton materialButton = fragmentEditCollectionDetailBinding4.saveBt;
        FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding5 = this.binding;
        if (fragmentEditCollectionDetailBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentEditCollectionDetailBinding2 = fragmentEditCollectionDetailBinding5;
        }
        materialButton.setClickable(fragmentEditCollectionDetailBinding2.saveBt.isEnabled());
    }

    private final void addRedStar(List<GlTextView> listOf) {
        for (GlTextView glTextView : listOf) {
            String obj = glTextView.getText().toString();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(obj + ProxyConfig.MATCH_ALL_SCHEMES);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FF6666")), obj.length(), spannableStringBuilder.length(), 34);
            glTextView.setText(spannableStringBuilder);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        if (getContext() == null) {
            Dialog onCreateDialog = super.onCreateDialog(savedInstanceState);
            Intrinsics.checkNotNullExpressionValue(onCreateDialog, "onCreateDialog(...)");
            return onCreateDialog;
        }
        return new BottomSheetDialog(requireContext(), R.style.TransparentBottomSheetStyle);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        try {
            super.onStart();
            View view = getRootView();
            Object parent = view != null ? view.getParent() : null;
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
            BottomSheetBehavior from = BottomSheetBehavior.from((View) parent);
            Intrinsics.checkNotNullExpressionValue(from, "from(...)");
            FragmentActivity activity = getActivity();
            if (activity != null && (window2 = activity.getWindow()) != null) {
                window2.setLayout(-1, -1);
            }
            FragmentActivity activity2 = getActivity();
            if (activity2 != null && (window = activity2.getWindow()) != null) {
                window.setGravity(80);
            }
            from.setState(3);
            from.setHideable(true);
            Dialog dialog = getDialog();
            if (dialog != null) {
                Intrinsics.checkNotNull(dialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                ((BottomSheetDialog) dialog).setDismissWithAnimation(true);
                setWhiteNavigationBar(dialog);
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    private final void setWhiteNavigationBar(Dialog r6) {
        Window window = r6.getWindow();
        if (window != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            GradientDrawable gradientDrawable = new GradientDrawable();
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setColor(-1);
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
            layerDrawable.setLayerInsetTop(1, displayMetrics.heightPixels);
            window.setBackgroundDrawable(layerDrawable);
        }
    }

    /* compiled from: CollectionDetailEditDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"Lcom/glority/android/picturexx/view/recognize/CollectionDetailEditDialogFragment$ImageAdapter;", "Lcom/glority/android/adapterhelper/BaseMultiItemQuickAdapter;", "Lcom/glority/base/entity/BaseMultiEntity;", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "<init>", "(Lcom/glority/android/picturexx/view/recognize/CollectionDetailEditDialogFragment;)V", "convert", "", "helper", "item", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public final class ImageAdapter extends BaseMultiItemQuickAdapter<BaseMultiEntity, BaseViewHolder> {
        public ImageAdapter() {
            super(CollectionsKt.emptyList());
            addItemType(0, R.layout.item_add_image);
            addItemType(1, R.layout.item_add_image_bt);
        }

        @Override // com.glority.android.adapterhelper.BaseQuickAdapter
        public void convert(BaseViewHolder helper, BaseMultiEntity item) {
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            View view = helper.itemView;
            if (item instanceof ImageEntity) {
                Glide.with(view).load(((ImageEntity) item).getUrl().toString()).placeholder(R.drawable.icon_image_holder).into((ImageView) helper.getView(R.id.iv));
                helper.addOnClickListener(R.id.iv_close1, R.id.iv);
            } else if (item instanceof AddEntity) {
                helper.addOnClickListener(R.id.add_bt);
            }
        }
    }

    @Override // com.glority.base.dialog.CustomDatePickerDialog.Listener
    public void onDateChanged(CustomDatePickerDialog r4, int r5, int monthOfYear, int dayOfMonth) {
        Intrinsics.checkNotNullParameter(r4, "dialog");
        if (isDetached()) {
            return;
        }
        try {
            Date date = new Date(r5 - 1900, monthOfYear, dayOfMonth);
            FragmentEditCollectionDetailBinding fragmentEditCollectionDetailBinding = this.binding;
            Collection collection = null;
            if (fragmentEditCollectionDetailBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentEditCollectionDetailBinding = null;
            }
            fragmentEditCollectionDetailBinding.acquisitionEt.setText(new SimpleDateFormat("dd-MM-yyyy", LocaleManager.getLocale(getResources())).format(date));
            Collection collection2 = this.originalCollectionClone;
            if (collection2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("originalCollectionClone");
            } else {
                collection = collection2;
            }
            collection.setAcquisitionDate(date);
            r4.dismiss();
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Dialog dialog = this.progress;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    private final String logPageName() {
        return "collectionedit";
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface r2) {
        Intrinsics.checkNotNullParameter(r2, "dialog");
        super.onDismiss(r2);
        if (this.userDismiss) {
            callbackStatus("cancelled");
        }
    }

    private final void businessDismiss() {
        this.userDismiss = false;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    private final void callbackStatus(String status) {
        this.statusCallback.invoke(status);
    }

    private final void updateVarietyTipUrl() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new CollectionDetailEditDialogFragment$updateVarietyTipUrl$1(null), 3, null);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public void dismiss() {
        try {
            super.dismiss();
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(2:10|11)(2:67|68))(4:69|70|(2:72|(1:74))|75)|12|(9:14|(1:16)|17|(5:19|(1:21)(1:32)|(3:23|(1:25)(1:30)|(1:27)(2:28|29))|31|29)|33|(1:35)|36|37|(5:47|48|(1:50)(2:54|(1:56))|51|52)(3:39|(1:41)(1:46)|42))(2:61|(3:63|(1:65)|66))|43|44))|77|6|7|(0)(0)|12|(0)(0)|43|44) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x0146, TryCatch #0 {all -> 0x0146, blocks: (B:11:0x002f, B:12:0x0061, B:14:0x006a, B:16:0x0073, B:17:0x0076, B:19:0x007a, B:21:0x007e, B:23:0x0086, B:25:0x008a, B:28:0x0093, B:29:0x00ae, B:31:0x00a1, B:33:0x00b9, B:35:0x00c5, B:36:0x00c8, B:48:0x00d5, B:50:0x00da, B:51:0x00f1, B:52:0x010a, B:54:0x00de, B:56:0x00e8, B:39:0x010e, B:41:0x0112, B:42:0x0119, B:58:0x00f5, B:60:0x00fd, B:61:0x012b, B:63:0x0133, B:65:0x013c, B:66:0x013f, B:70:0x003e, B:72:0x0046), top: B:7:0x0023, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b A[Catch: all -> 0x0146, TryCatch #0 {all -> 0x0146, blocks: (B:11:0x002f, B:12:0x0061, B:14:0x006a, B:16:0x0073, B:17:0x0076, B:19:0x007a, B:21:0x007e, B:23:0x0086, B:25:0x008a, B:28:0x0093, B:29:0x00ae, B:31:0x00a1, B:33:0x00b9, B:35:0x00c5, B:36:0x00c8, B:48:0x00d5, B:50:0x00da, B:51:0x00f1, B:52:0x010a, B:54:0x00de, B:56:0x00e8, B:39:0x010e, B:41:0x0112, B:42:0x0119, B:58:0x00f5, B:60:0x00fd, B:61:0x012b, B:63:0x0133, B:65:0x013c, B:66:0x013f, B:70:0x003e, B:72:0x0046), top: B:7:0x0023, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object doAfterSaveCollection(final kotlin.Pair<? extends com.glority.network.model.Status, com.picturecoin.generatedAPI.kotlinAPI.collection.Collection> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment.doAfterSaveCollection(kotlin.Pair, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void doAfterSaveCollection$lambda$32(CollectionDetailEditDialogFragment this$0, Pair it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        try {
            if (this$0.nextPage == 2) {
                this$0.toCollectionList();
            } else if (Intrinsics.areEqual(this$0.from, LogEvents.itemdetail)) {
                this$0.toCollectionDetail((Collection) it.getSecond());
            }
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }
}
