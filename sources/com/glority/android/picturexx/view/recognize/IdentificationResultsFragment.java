package com.glority.android.picturexx.view.recognize;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.cmsui2.R;
import com.glority.android.cmsui2.util.CmsDataUtils;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.picturexx.business.databinding.FragmentCustomIdentificationResultsBinding;
import com.glority.android.picturexx.business.databinding.ItemIdentifyResultsFlagBinding;
import com.glority.android.picturexx.recognize.CoreActivity;
import com.glority.android.picturexx.view.dialog.CoinSatisfactionSurveyDialog;
import com.glority.android.picturexx.vm.IdentificationResultViewModel;
import com.glority.android.picturexx.vm.MainRecognizeProcess;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.Constants;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.abtest.CoinAbTestUtils;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.span.CenteredImageSpan;
import com.glority.base.utils.NavigationAnimaUtils;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import com.glority.utils.stability.LogUtils;
import com.glority.widget.imagepager.GlNormalImagePagerActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: IdentificationResultsFragment.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0002\u0015\u0018\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0014J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J=\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2#\u0010\u001f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00100 H\u0002J\u0016\u0010%\u001a\u00020\u00102\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001e0'H\u0002J\b\u0010(\u001a\u00020\u0010H\u0002J\b\u0010)\u001a\u00020\u0010H\u0002J\b\u0010*\u001a\u00020\u0010H\u0002J\u0010\u0010+\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010,\u001a\u00020-H\u0014J\b\u0010.\u001a\u00020\u0010H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u0010\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0019¨\u0006/"}, d2 = {"Lcom/glority/android/picturexx/view/recognize/IdentificationResultsFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentCustomIdentificationResultsBinding;", "<init>", "()V", "vm", "Lcom/glority/android/picturexx/vm/IdentificationResultViewModel;", "getVm", "()Lcom/glority/android/picturexx/vm/IdentificationResultViewModel;", "vm$delegate", "Lkotlin/Lazy;", "handler", "Landroid/os/Handler;", "getLayoutId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "doCreateView", "mainImageAdapter", "com/glority/android/picturexx/view/recognize/IdentificationResultsFragment$mainImageAdapter$1", "Lcom/glority/android/picturexx/view/recognize/IdentificationResultsFragment$mainImageAdapter$1;", "coinAdapter", "com/glority/android/picturexx/view/recognize/IdentificationResultsFragment$coinAdapter$1", "Lcom/glority/android/picturexx/view/recognize/IdentificationResultsFragment$coinAdapter$1;", "getFlagLayoutBitmap", "isBest", "", Args.cmsName, "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "onDrawDown", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "Lkotlin/ParameterName;", "name", "bitmap", "initView", "data", "", "initHeaderView", "retake", "onBack", "toDetail", "getLogPageName", "", "onDestroy", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class IdentificationResultsFragment extends BaseFragment<FragmentCustomIdentificationResultsBinding> {
    public static final int $stable = 8;
    private final IdentificationResultsFragment$coinAdapter$1 coinAdapter;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final IdentificationResultsFragment$mainImageAdapter$1 mainImageAdapter;

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm;

    /* JADX WARN: Type inference failed for: r1v3, types: [com.glority.android.picturexx.view.recognize.IdentificationResultsFragment$mainImageAdapter$1] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.glority.android.picturexx.view.recognize.IdentificationResultsFragment$coinAdapter$1] */
    public IdentificationResultsFragment() {
        final IdentificationResultsFragment identificationResultsFragment = this;
        final Function0 function0 = null;
        this.vm = FragmentViewModelLazyKt.createViewModelLazy(identificationResultsFragment, Reflection.getOrCreateKotlinClass(IdentificationResultViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultsFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultsFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = identificationResultsFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultsFragment$special$$inlined$activityViewModels$default$3
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
        final int i = R.layout.item_result_main_imge;
        this.mainImageAdapter = new BaseQuickAdapter<String, BaseViewHolder>(i) { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultsFragment$mainImageAdapter$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.glority.android.adapterhelper.BaseQuickAdapter
            public void convert(BaseViewHolder helper, String item) {
                Intrinsics.checkNotNullParameter(helper, "helper");
                Intrinsics.checkNotNullParameter(item, "item");
                Glide.with(helper.itemView.getContext()).load(item).placeholder(com.glority.android.picturexx.business.R.drawable.main_img_place_holder).centerCrop().into((ImageView) helper.getView(com.glority.android.picturexx.business.R.id.detail_header_iv));
            }
        };
        final int i2 = com.glority.android.picturexx.business.R.layout.item_result_coin;
        this.coinAdapter = new BaseQuickAdapter<CmsName, BaseViewHolder>(i2) { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultsFragment$coinAdapter$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.glority.android.adapterhelper.BaseQuickAdapter
            public void convert(final BaseViewHolder helper, CmsName item) {
                Intrinsics.checkNotNullParameter(helper, "helper");
                Intrinsics.checkNotNullParameter(item, "item");
                String tagValue = CmsDataUtils.INSTANCE.getTagValue(item, "Image:DenominationSide");
                String tagValue2 = CmsDataUtils.INSTANCE.getTagValue(item, "Image:SubjectSide");
                String tagValue3 = CmsDataUtils.INSTANCE.getTagValue(item, "Year");
                if (tagValue3 == null) {
                    tagValue3 = "";
                }
                final String str = item.getName().getPreferredName() + "," + tagValue3;
                final ImageView imageView = (ImageView) helper.getView(com.glority.android.picturexx.business.R.id.iv_img1);
                ImageView imageView2 = (ImageView) helper.getView(com.glority.android.picturexx.business.R.id.iv_img2);
                Glide.with(imageView).load(tagValue).placeholder(com.glority.android.picturexx.business.R.drawable.icon_img_place_holder).into(imageView);
                Glide.with(imageView2).load(tagValue2).placeholder(com.glority.android.picturexx.business.R.drawable.icon_img_place_holder).into(imageView2);
                ((TextView) helper.getView(com.glority.android.picturexx.business.R.id.tv_name)).setText(str);
                int indexOf = getData().indexOf(item) + 1;
                if (indexOf == 1) {
                    helper.setBackgroundColor(com.glority.android.picturexx.business.R.id.title_ll, Color.parseColor("#FEECC6"));
                    helper.setImageResource(com.glority.android.picturexx.business.R.id.iv_arrow, com.glority.android.picturexx.business.R.drawable.icon_identification_results_4);
                    helper.setVisible(com.glority.android.picturexx.business.R.id.best_match_tv, true);
                    helper.setVisible(com.glority.android.picturexx.business.R.id.index_iv, false);
                    ((ViewGroup) helper.getView(com.glority.android.picturexx.business.R.id.item_ll)).setBackgroundResource(com.glority.android.picturexx.business.R.drawable.bg_identify_results_best_match);
                } else {
                    helper.setBackgroundColor(com.glority.android.picturexx.business.R.id.title_ll, Color.parseColor("#F3F3F3"));
                    helper.setVisible(com.glority.android.picturexx.business.R.id.best_match_tv, false);
                    helper.setImageResource(com.glority.android.picturexx.business.R.id.iv_arrow, com.glority.android.picturexx.business.R.drawable.icon_identification_results_5);
                    if (indexOf == 2) {
                        helper.setVisible(com.glority.android.picturexx.business.R.id.index_iv, true);
                        helper.setImageResource(com.glority.android.picturexx.business.R.id.index_iv, com.glority.android.picturexx.business.R.drawable.icon_identification_results_2);
                    } else if (indexOf == 3) {
                        helper.setVisible(com.glority.android.picturexx.business.R.id.index_iv, true);
                        helper.setImageResource(com.glority.android.picturexx.business.R.id.index_iv, com.glority.android.picturexx.business.R.drawable.icon_identification_results_3);
                    }
                    ((ViewGroup) helper.getView(com.glority.android.picturexx.business.R.id.item_ll)).setBackgroundResource(com.glority.android.picturexx.business.R.drawable.bg_identify_results_other);
                }
                IdentificationResultsFragment.this.getFlagLayoutBitmap(indexOf == 1, item, new Function1<Bitmap, Unit>() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultsFragment$coinAdapter$1$convert$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
                        invoke2(bitmap);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Bitmap bitmap) {
                        if (bitmap != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("  " + str);
                            Context context = imageView.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                            spannableStringBuilder.setSpan(new CenteredImageSpan(context, bitmap), 0, 1, 17);
                            ((TextView) helper.getView(com.glority.android.picturexx.business.R.id.tv_name)).setText(spannableStringBuilder);
                        }
                    }
                });
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FragmentCustomIdentificationResultsBinding access$getBinding(IdentificationResultsFragment identificationResultsFragment) {
        return (FragmentCustomIdentificationResultsBinding) identificationResultsFragment.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IdentificationResultViewModel getVm() {
        return (IdentificationResultViewModel) this.vm.getValue();
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return com.glority.android.picturexx.business.R.layout.fragment_custom_identification_results;
    }

    @Override // com.glority.base.fragment.BaseFragment, com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        String str;
        List<CmsName> value = getVm().getIdentificationResultLiveData().getValue();
        if (value != null) {
            Pair<String, ? extends Object>[] pairArr = new Pair[3];
            Long l = (Long) CollectionsKt.firstOrNull((List) getVm().getItemIds());
            pairArr[0] = new Pair<>(LogEventArguments.ARG_STRING_1, String.valueOf(l != null ? l.longValue() : 0L));
            CmsName cmsName = (CmsName) CollectionsKt.getOrNull(value, 0);
            if (cmsName == null || (str = cmsName.getUid()) == null) {
                str = "";
            }
            pairArr[1] = new Pair<>(LogEventArguments.ARG_STRING_2, str);
            pairArr[2] = new Pair<>("count", Integer.valueOf(value.size()));
            updateCommonEventArgs(pairArr);
        }
        super.onCreate(savedInstanceState);
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        PersistData.INSTANCE.set(Constants.recognizeCount, Integer.valueOf(((Number) PersistData.INSTANCE.get(Constants.recognizeCount, 0)).intValue() + 1));
        getVm().getIdentificationResultLiveData().observe(this, new IdentificationResultsFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends CmsName>, Unit>() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultsFragment$doCreateView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends CmsName> list) {
                invoke2((List<CmsName>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<CmsName> list) {
                IdentificationResultsFragment identificationResultsFragment = IdentificationResultsFragment.this;
                Intrinsics.checkNotNull(list);
                identificationResultsFragment.initView(list);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getFlagLayoutBitmap(boolean isBest, CmsName cmsName, final Function1<? super Bitmap, Unit> onDrawDown) {
        final ItemIdentifyResultsFlagBinding inflate = ItemIdentifyResultsFlagBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        String tagValue = CmsDataUtils.INSTANCE.getTagValue(cmsName, "IssuerCountryCode2");
        String tagValue2 = CmsDataUtils.INSTANCE.getTagValue(cmsName, "IssuerCountryCode3");
        if (tagValue2 == null) {
            return;
        }
        ShapeableImageView flagIv = inflate.flagIv;
        Intrinsics.checkNotNullExpressionValue(flagIv, "flagIv");
        flagIv.setVisibility(tagValue != null ? 0 : 8);
        if (!isBest) {
            inflate.flagLl.setBackgroundResource(com.glority.android.picturexx.business.R.drawable.bg_flag_other);
            inflate.countryNameTv.setTextColor(Color.parseColor("#8E949A"));
        }
        inflate.countryNameTv.setText(tagValue2);
        inflate.getRoot().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        inflate.getRoot().layout(0, 0, inflate.getRoot().getMeasuredWidth(), inflate.getRoot().getMeasuredHeight());
        Bitmap bitmap = null;
        try {
            View root = inflate.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            bitmap = ViewKt.drawToBitmap$default(root, null, 1, null);
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
        onDrawDown.invoke(bitmap);
        Glide.with(inflate.flagIv).asBitmap().load(CmsDataUtils.INSTANCE.getCountryFlagIconUrl(tagValue)).into((RequestBuilder<Bitmap>) new SimpleTarget<Bitmap>() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultsFragment$getFlagLayoutBitmap$2
            @Override // com.bumptech.glide.request.target.Target
            public /* bridge */ /* synthetic */ void onResourceReady(Object obj, Transition transition) {
                onResourceReady((Bitmap) obj, (Transition<? super Bitmap>) transition);
            }

            public void onResourceReady(Bitmap resource, Transition<? super Bitmap> transition) {
                Intrinsics.checkNotNullParameter(resource, "resource");
                ItemIdentifyResultsFlagBinding.this.flagIv.setImageBitmap(resource);
                Function1<Bitmap, Unit> function1 = onDrawDown;
                Bitmap bitmap2 = null;
                try {
                    View root2 = ItemIdentifyResultsFlagBinding.this.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
                    bitmap2 = ViewKt.drawToBitmap$default(root2, null, 1, null);
                } catch (Exception e2) {
                    if (AppContext.INSTANCE.isDebugMode()) {
                        LogUtils.e(Log.getStackTraceString(e2));
                    }
                }
                function1.invoke(bitmap2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void initView(final List<CmsName> data) {
        ImageView ivClose = ((FragmentCustomIdentificationResultsBinding) getBinding()).ivClose;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        ViewExtensionsKt.setSingleClickListener$default(ivClose, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultsFragment$initView$1
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
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(IdentificationResultsFragment.this, LogEvents.resultlist_close_click, null, 2, null);
                IdentificationResultsFragment.this.onBack();
            }
        }, 1, (Object) null);
        initHeaderView();
        ((FragmentCustomIdentificationResultsBinding) getBinding()).rv.setAdapter(this.coinAdapter);
        setOnItemClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultsFragment$initView$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, Integer num) {
                invoke(baseQuickAdapter, view, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, int i) {
                Intrinsics.checkNotNullParameter(baseQuickAdapter, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(IdentificationResultsFragment.this, LogEvents.resultlist_todetail_click, null, 2, null);
                IdentificationResultsFragment.this.toDetail(data.get(i));
            }
        });
        MaterialButton retakeTv = ((FragmentCustomIdentificationResultsBinding) getBinding()).retakeTv;
        Intrinsics.checkNotNullExpressionValue(retakeTv, "retakeTv");
        ViewExtensionsKt.setSingleClickListener$default(retakeTv, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultsFragment$initView$3
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
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(IdentificationResultsFragment.this, LogEvents.resultlist_retake_click, null, 2, null);
                IdentificationResultsFragment.this.retake();
            }
        }, 1, (Object) null);
        setNewData(data);
        if (data.isEmpty()) {
            com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this, LogEvents.resultlist_noresult_show, null, 2, null);
            View inflate = LayoutInflater.from(getContext()).inflate(com.glority.android.picturexx.business.R.layout.coin_not_found, (ViewGroup) null);
            View findViewById = inflate.findViewById(com.glority.android.picturexx.business.R.id.tv_retake);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            ViewExtensionsKt.setSingleClickListener$default(findViewById, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultsFragment$initView$4
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
                    com.glority.android.ui.base.v2.BaseFragment.logEvent$default(IdentificationResultsFragment.this, LogEvents.resultlist_noresultretake_click, null, 2, null);
                    IdentificationResultsFragment.this.retake();
                }
            }, 1, (Object) null);
            LinearLayout retakeLl = ((FragmentCustomIdentificationResultsBinding) getBinding()).retakeLl;
            Intrinsics.checkNotNullExpressionValue(retakeLl, "retakeLl");
            retakeLl.setVisibility(8);
            IdentificationResultsFragment$coinAdapter$1 identificationResultsFragment$coinAdapter$1 = this.coinAdapter;
            Intrinsics.checkNotNull(inflate);
            identificationResultsFragment$coinAdapter$1.setEmptyView(inflate);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initHeaderView() {
        ((FragmentCustomIdentificationResultsBinding) getBinding()).mainImageVp.setAdapter(this.mainImageAdapter);
        ((FragmentCustomIdentificationResultsBinding) getBinding()).mainImageVp.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultsFragment$initHeaderView$1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int position) {
                IdentificationResultsFragment$mainImageAdapter$1 identificationResultsFragment$mainImageAdapter$1;
                super.onPageSelected(position);
                TextView textView = IdentificationResultsFragment.access$getBinding(IdentificationResultsFragment.this).pagerIndex;
                Integer valueOf = Integer.valueOf(position + 1);
                identificationResultsFragment$mainImageAdapter$1 = IdentificationResultsFragment.this.mainImageAdapter;
                String format = String.format("%d/%d", Arrays.copyOf(new Object[]{valueOf, Integer.valueOf(identificationResultsFragment$mainImageAdapter$1.getData().size())}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                textView.setText(format);
            }
        });
        setNewData(getVm().getDisplayImage());
        setOnItemClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultsFragment$initHeaderView$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, Integer num) {
                invoke(baseQuickAdapter, view, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BaseQuickAdapter<?, ?> adapter, View view, int i) {
                IdentificationResultsFragment$mainImageAdapter$1 identificationResultsFragment$mainImageAdapter$1;
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "view");
                GlNormalImagePagerActivity.Companion companion = GlNormalImagePagerActivity.INSTANCE;
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                identificationResultsFragment$mainImageAdapter$1 = IdentificationResultsFragment.this.mainImageAdapter;
                companion.open(context, (String[]) identificationResultsFragment$mainImageAdapter$1.getData().toArray(new String[0]), i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retake() {
        FragmentActivity activity = getActivity();
        final IdentificationResultActivity identificationResultActivity = activity instanceof IdentificationResultActivity ? (IdentificationResultActivity) activity : null;
        if (identificationResultActivity != null) {
            identificationResultActivity.identify(new Function0<Unit>() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultsFragment$retake$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
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
                    IdentificationResultViewModel vm;
                    IdentificationResultsFragment identificationResultsFragment = IdentificationResultsFragment.this;
                    com.glority.android.ui.base.v2.BaseFragment.logEvent$default(identificationResultsFragment, identificationResultsFragment.getPageName() + "_retake", null, 2, null);
                    if (CoinSatisfactionSurveyDialog.INSTANCE.canShow(((Number) PersistData.INSTANCE.get(Constants.recognizeCount, 0)).intValue(), AppViewModel.INSTANCE.isVip(), false)) {
                        CoinSatisfactionSurveyDialog coinSatisfactionSurveyDialog = CoinSatisfactionSurveyDialog.INSTANCE;
                        IdentificationResultActivity identificationResultActivity2 = identificationResultActivity;
                        vm = IdentificationResultsFragment.this.getVm();
                        Long l = (Long) CollectionsKt.firstOrNull((List) vm.getItemIds());
                        long longValue = l != null ? l.longValue() : 0L;
                        int intValue = ((Number) PersistData.INSTANCE.get(Constants.recognizeCount, 0)).intValue();
                        final IdentificationResultsFragment identificationResultsFragment2 = IdentificationResultsFragment.this;
                        coinSatisfactionSurveyDialog.open(identificationResultActivity2, LogEvents.result, longValue, intValue, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultsFragment$retake$1$1.1
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
                                CoreActivity.Companion companion = CoreActivity.INSTANCE;
                                FragmentActivity requireActivity = IdentificationResultsFragment.this.requireActivity();
                                Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
                                companion.start((RuntimePermissionActivity) requireActivity, new MainRecognizeProcess(), (r17 & 4) != 0 ? 1 : 2, (r17 & 8) != 0 ? false : true, IdentificationResultsFragment.this.getPageName(), (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null);
                            }
                        });
                        return;
                    }
                    CoreActivity.Companion companion = CoreActivity.INSTANCE;
                    FragmentActivity requireActivity = IdentificationResultsFragment.this.requireActivity();
                    Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
                    companion.start((RuntimePermissionActivity) requireActivity, new MainRecognizeProcess(), (r17 & 4) != 0 ? 1 : 2, (r17 & 8) != 0 ? false : true, IdentificationResultsFragment.this.getPageName(), (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBack() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toDetail(CmsName cmsName) {
        getVm().getCurrentCmsName().setValue(cmsName);
        IdentificationResultViewModel vm = getVm();
        Map<String, String> uidYearMap = getVm().getUidYearMap();
        if (uidYearMap != null) {
            CmsName value = getVm().getCurrentCmsName().getValue();
            r1 = uidYearMap.get(value != null ? value.getUid() : null);
        }
        vm.setYear(r1);
        if (CoinAbTestUtils.INSTANCE.enableValueChecker()) {
            com.glority.base.ext.ViewExtensionsKt.navigateWithHandOnBundle$default(this, com.glority.android.picturexx.business.R.id.action_identificationResultsFragment_to_nav_graph_grading_value_check, null, NavigationAnimaUtils.INSTANCE.getSlideAnima(getActivity()), null, 10, null);
        } else {
            com.glority.base.ext.ViewExtensionsKt.navigateWithHandOnBundle$default(this, com.glority.android.picturexx.business.R.id.action_identificationResultsFragment_to_nav_graph_grading_identify2, null, NavigationAnimaUtils.INSTANCE.getSlideAnima(getActivity()), null, 10, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    public String getPageName() {
        return LogEvents.resultlist;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.handler.removeCallbacksAndMessages(null);
    }
}
