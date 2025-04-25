package com.glority.android.picturexx.view.me;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.cmsui2.R;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.share.SharePlatform;
import com.glority.android.core.route.share.ShareRequest;
import com.glority.android.database.DBManager;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.picturexx.business.databinding.FragmentCollectionShareBinding;
import com.glority.android.picturexx.extensions.CollectionItemExtKt;
import com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment;
import com.glority.android.picturexx.vm.CollectionViewModel;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.utils.ImageUtils;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import com.glority.widget.GlProgressDialog;
import com.glority.widget.GlTextView;
import com.glority.widget.imagepager.GlNormalImagePagerActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: CollectionShareFragment.kt */
@Metadata(d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0006\u0010\u001e\u001a\u00020\u001bJ\u0006\u0010\u001f\u001a\u00020\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020!H\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020!H\u0002J\u0016\u0010)\u001a\u00020\u001b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120+H\u0002J\u0014\u0010,\u001a\u0004\u0018\u00010!2\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J\b\u0010/\u001a\u00020\u0012H\u0014J\b\u00100\u001a\u00020$H\u0014R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u0010\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0004\n\u0002\u0010(¨\u00061"}, d2 = {"Lcom/glority/android/picturexx/view/me/CollectionShareFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentCollectionShareBinding;", "<init>", "()V", "vm", "Lcom/glority/android/picturexx/vm/CollectionViewModel;", "getVm", "()Lcom/glority/android/picturexx/vm/CollectionViewModel;", "vm$delegate", "Lkotlin/Lazy;", Args.cmsName, "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "getCmsName", "()Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "setCmsName", "(Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;)V", Args.subjectSideUrl, "", "getSubjectSideUrl", "()Ljava/lang/String;", "setSubjectSideUrl", "(Ljava/lang/String;)V", Args.denominationSideUrl, "getDenominationSideUrl", "setDenominationSideUrl", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", FirebaseAnalytics.Event.SHARE, "download", "drawDownloadBitmap", "Landroid/graphics/Bitmap;", "coinBitmap", "calculateAverageColor", "", "bitmap", "mainImageAdapter", "com/glority/android/picturexx/view/me/CollectionShareFragment$mainImageAdapter$1", "Lcom/glority/android/picturexx/view/me/CollectionShareFragment$mainImageAdapter$1;", "setHeaderImage", "images", "", "loadBitmapFromView", "v", "Landroid/view/View;", "getLogPageName", "getLayoutId", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CollectionShareFragment extends BaseFragment<FragmentCollectionShareBinding> {
    public static final int $stable = 8;
    private CmsName cmsName;
    private String denominationSideUrl;
    private final CollectionShareFragment$mainImageAdapter$1 mainImageAdapter;
    private String subjectSideUrl;

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm;

    /* JADX WARN: Type inference failed for: r1v2, types: [com.glority.android.picturexx.view.me.CollectionShareFragment$mainImageAdapter$1] */
    public CollectionShareFragment() {
        final CollectionShareFragment collectionShareFragment = this;
        final Function0 function0 = null;
        this.vm = FragmentViewModelLazyKt.createViewModelLazy(collectionShareFragment, Reflection.getOrCreateKotlinClass(CollectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.me.CollectionShareFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.me.CollectionShareFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = collectionShareFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.me.CollectionShareFragment$special$$inlined$activityViewModels$default$3
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
        final int i = R.layout.item_result_main_imge_share;
        this.mainImageAdapter = new BaseQuickAdapter<String, BaseViewHolder>(i) { // from class: com.glority.android.picturexx.view.me.CollectionShareFragment$mainImageAdapter$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.glority.android.adapterhelper.BaseQuickAdapter
            public void convert(BaseViewHolder helper, final String item) {
                Intrinsics.checkNotNullParameter(helper, "helper");
                Intrinsics.checkNotNullParameter(item, "item");
                final ImageView imageView = (ImageView) helper.getView(com.glority.android.picturexx.business.R.id.detail_header_share_iv);
                Glide.with(helper.itemView.getContext()).asBitmap().load(item).placeholder(com.glority.android.picturexx.business.R.drawable.main_img_place_holder).addListener(new RequestListener<Bitmap>() { // from class: com.glority.android.picturexx.view.me.CollectionShareFragment$mainImageAdapter$1$convert$1
                    @Override // com.bumptech.glide.request.RequestListener
                    public boolean onLoadFailed(GlideException e, Object model, Target<Bitmap> target, boolean isFirstResource) {
                        Intrinsics.checkNotNullParameter(target, "target");
                        return false;
                    }

                    @Override // com.bumptech.glide.request.RequestListener
                    public boolean onResourceReady(Bitmap resource, Object model, Target<Bitmap> target, DataSource dataSource, boolean isFirstResource) {
                        Intrinsics.checkNotNullParameter(resource, "resource");
                        Intrinsics.checkNotNullParameter(model, "model");
                        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                        if (resource.getWidth() / resource.getHeight() > 1.2f || resource.getWidth() / resource.getHeight() < 0.7f) {
                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            return false;
                        }
                        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        return false;
                    }
                }).into(imageView);
                View itemView = helper.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                ViewExtensionsKt.setSingleClickListener$default(itemView, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.CollectionShareFragment$mainImageAdapter$1$convert$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        GlNormalImagePagerActivity.Companion companion = GlNormalImagePagerActivity.INSTANCE;
                        Context context = it.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        companion.open(context, (String[]) getData().toArray(new String[0]), getData().indexOf(item));
                    }
                }, 1, (Object) null);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FragmentCollectionShareBinding access$getBinding(CollectionShareFragment collectionShareFragment) {
        return (FragmentCollectionShareBinding) collectionShareFragment.getBinding();
    }

    public final CollectionViewModel getVm() {
        return (CollectionViewModel) this.vm.getValue();
    }

    public final CmsName getCmsName() {
        return this.cmsName;
    }

    public final void setCmsName(CmsName cmsName) {
        this.cmsName = cmsName;
    }

    public final String getSubjectSideUrl() {
        return this.subjectSideUrl;
    }

    public final void setSubjectSideUrl(String str) {
        this.subjectSideUrl = str;
    }

    public final String getDenominationSideUrl() {
        return this.denominationSideUrl;
    }

    public final void setDenominationSideUrl(String str) {
        this.denominationSideUrl = str;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        DBManager.INSTANCE.getCollectionItemDao().getItem(getVm().getCollectionId()).observe(this, new CollectionShareFragment$sam$androidx_lifecycle_Observer$0(new Function1<CollectionItem, Unit>() { // from class: com.glority.android.picturexx.view.me.CollectionShareFragment$doCreateView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CollectionItem collectionItem) {
                invoke2(collectionItem);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final CollectionItem collectionItem) {
                if (collectionItem != null) {
                    CollectionShareFragment.this.setSubjectSideUrl(collectionItem.getSubjectSideUrl());
                    CollectionShareFragment.this.setDenominationSideUrl(collectionItem.getDenominationSideUrl());
                    GlTextView ivEdit = CollectionShareFragment.access$getBinding(CollectionShareFragment.this).ivEdit;
                    Intrinsics.checkNotNullExpressionValue(ivEdit, "ivEdit");
                    ivEdit.setVisibility(0);
                    CollectionShareFragment.this.setHeaderImage(CollectionsKt.toMutableList((Collection) collectionItem.getImageUrl()));
                    CollectionShareFragment.access$getBinding(CollectionShareFragment.this).tvName.setText(collectionItem.getDisplayName());
                    GlTextView ivEdit2 = CollectionShareFragment.access$getBinding(CollectionShareFragment.this).ivEdit;
                    Intrinsics.checkNotNullExpressionValue(ivEdit2, "ivEdit");
                    final CollectionShareFragment collectionShareFragment = CollectionShareFragment.this;
                    ViewExtensionsKt.setSingleClickListener$default(ivEdit2, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.CollectionShareFragment$doCreateView$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(View view) {
                            invoke2(view);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(View v) {
                            Intrinsics.checkNotNullParameter(v, "v");
                            com.glority.android.ui.base.v2.BaseFragment.logEvent$default(CollectionShareFragment.this, LogEvents.collectiondetail_edit_click, null, 2, null);
                            CollectionDetailEditDialogFragment.Companion.editOpen$default(CollectionDetailEditDialogFragment.INSTANCE, CollectionShareFragment.this.getSupportFragmentManager(), collectionItem.toCollection(), 0, LogEvents.collectionLabel, CollectionShareFragment.this.getCmsName(), null, null, 96, null);
                        }
                    }, 1, (Object) null);
                    FrameLayout llYear = CollectionShareFragment.access$getBinding(CollectionShareFragment.this).llYear;
                    Intrinsics.checkNotNullExpressionValue(llYear, "llYear");
                    FrameLayout frameLayout = llYear;
                    String year = collectionItem.getYear();
                    frameLayout.setVisibility((year == null || year.length() == 0) ^ true ? 0 : 8);
                    CollectionShareFragment.access$getBinding(CollectionShareFragment.this).tvYear.setText(collectionItem.getYear());
                    FrameLayout mintmarkYear = CollectionShareFragment.access$getBinding(CollectionShareFragment.this).mintmarkYear;
                    Intrinsics.checkNotNullExpressionValue(mintmarkYear, "mintmarkYear");
                    FrameLayout frameLayout2 = mintmarkYear;
                    String mintMark = collectionItem.getMintMark();
                    frameLayout2.setVisibility((mintMark == null || mintMark.length() == 0) ^ true ? 0 : 8);
                    CollectionShareFragment.access$getBinding(CollectionShareFragment.this).tvMintmark.setText(collectionItem.getMintMark());
                    LinearLayout acquisitionLl = CollectionShareFragment.access$getBinding(CollectionShareFragment.this).acquisitionLl;
                    Intrinsics.checkNotNullExpressionValue(acquisitionLl, "acquisitionLl");
                    acquisitionLl.setVisibility(collectionItem.getAcquisitionPrice() != null || collectionItem.getDate() != null ? 0 : 8);
                    FrameLayout llCost = CollectionShareFragment.access$getBinding(CollectionShareFragment.this).llCost;
                    Intrinsics.checkNotNullExpressionValue(llCost, "llCost");
                    llCost.setVisibility(collectionItem.getAcquisitionPrice() != null ? 0 : 8);
                    CollectionShareFragment.access$getBinding(CollectionShareFragment.this).tvCost.setText(collectionItem.getPriceUnit() + " " + collectionItem.getAcquisitionPrice());
                    FrameLayout llDateAcquired = CollectionShareFragment.access$getBinding(CollectionShareFragment.this).llDateAcquired;
                    Intrinsics.checkNotNullExpressionValue(llDateAcquired, "llDateAcquired");
                    llDateAcquired.setVisibility(collectionItem.getDate() != null ? 0 : 8);
                    CollectionShareFragment.access$getBinding(CollectionShareFragment.this).tvDate.setText(String.valueOf(collectionItem.getFormatDate()));
                    LinearLayout noteLl = CollectionShareFragment.access$getBinding(CollectionShareFragment.this).noteLl;
                    Intrinsics.checkNotNullExpressionValue(noteLl, "noteLl");
                    LinearLayout linearLayout = noteLl;
                    String note = collectionItem.getNote();
                    linearLayout.setVisibility((note == null || note.length() == 0) ^ true ? 0 : 8);
                    CollectionShareFragment.access$getBinding(CollectionShareFragment.this).noteTv.setText(collectionItem.getNote());
                    GlTextView tvGrade = CollectionShareFragment.access$getBinding(CollectionShareFragment.this).tvGrade;
                    Intrinsics.checkNotNullExpressionValue(tvGrade, "tvGrade");
                    GlTextView glTextView = tvGrade;
                    String displayGrade = CollectionItemExtKt.getDisplayGrade(collectionItem);
                    glTextView.setVisibility((displayGrade == null || displayGrade.length() == 0) ^ true ? 0 : 8);
                    CollectionShareFragment.access$getBinding(CollectionShareFragment.this).tvGrade.setText(CollectionItemExtKt.getDisplayGrade(collectionItem));
                }
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void share() {
        Bitmap loadBitmapFromView = loadBitmapFromView(((FragmentCollectionShareBinding) getBinding()).cardView);
        if (loadBitmapFromView != null) {
            ImageUtils imageUtils = ImageUtils.INSTANCE;
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            new ShareRequest("", ImageUtils.getShareUri$default(imageUtils, requireActivity, loadBitmapFromView, null, 4, null), SharePlatform.MORE).post();
        }
    }

    public final void download() {
        Dialog dialog;
        if (getContext() != null) {
            GlProgressDialog glProgressDialog = GlProgressDialog.INSTANCE;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            dialog = GlProgressDialog.show$default(glProgressDialog, requireContext, true, (String) null, 0L, 12, (Object) null);
        } else {
            dialog = null;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new CollectionShareFragment$download$1(this, dialog, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap drawDownloadBitmap(Bitmap coinBitmap) {
        int width = (int) (coinBitmap.getWidth() * 1.415d);
        int height = (int) (coinBitmap.getHeight() * 1.8d);
        float f = width;
        float f2 = height;
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(calculateAverageColor(coinBitmap));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        canvas.drawBitmap(coinBitmap, 0.147f * f, 0.143f * f2, paint);
        if (!AppViewModel.INSTANCE.isVip()) {
            canvas.drawBitmap(BitmapFactory.decodeResource(getResources(), com.glority.android.picturexx.business.R.drawable.icon_export_logo), (Rect) null, new RectF(0.28f * f, 0.77f * f2, f * 0.72f, f2 * 0.8568f), paint);
        }
        return createBitmap;
    }

    private final int calculateAverageColor(Bitmap bitmap) {
        int width = bitmap.getWidth() * bitmap.getHeight();
        int[] iArr = new int[width];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < width; i4++) {
            int i5 = iArr[i4];
            i += Color.red(i5);
            i2 += Color.green(i5);
            i3 += Color.blue(i5);
        }
        return Color.rgb(i / width, i2 / width, i3 / width);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setHeaderImage(List<String> images) {
        ((FragmentCollectionShareBinding) getBinding()).mainImageVp.setAdapter(this.mainImageAdapter);
        ((FragmentCollectionShareBinding) getBinding()).mainImageVp.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.glority.android.picturexx.view.me.CollectionShareFragment$setHeaderImage$1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int position) {
                CollectionShareFragment$mainImageAdapter$1 collectionShareFragment$mainImageAdapter$1;
                CollectionShareFragment$mainImageAdapter$1 collectionShareFragment$mainImageAdapter$12;
                super.onPageSelected(position);
                TextView pagerIndex = CollectionShareFragment.access$getBinding(CollectionShareFragment.this).pagerIndex;
                Intrinsics.checkNotNullExpressionValue(pagerIndex, "pagerIndex");
                TextView textView = pagerIndex;
                collectionShareFragment$mainImageAdapter$1 = CollectionShareFragment.this.mainImageAdapter;
                textView.setVisibility(collectionShareFragment$mainImageAdapter$1.getData().size() > 1 ? 0 : 8);
                TextView textView2 = CollectionShareFragment.access$getBinding(CollectionShareFragment.this).pagerIndex;
                Integer valueOf = Integer.valueOf(position + 1);
                collectionShareFragment$mainImageAdapter$12 = CollectionShareFragment.this.mainImageAdapter;
                String format = String.format("%d/%d", Arrays.copyOf(new Object[]{valueOf, Integer.valueOf(collectionShareFragment$mainImageAdapter$12.getData().size())}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                textView2.setText(format);
            }
        });
        setNewData(images);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Bitmap loadBitmapFromView(View v) {
        GlTextView ivEdit = ((FragmentCollectionShareBinding) getBinding()).ivEdit;
        Intrinsics.checkNotNullExpressionValue(ivEdit, "ivEdit");
        ivEdit.setVisibility(8);
        TextView pagerIndex = ((FragmentCollectionShareBinding) getBinding()).pagerIndex;
        Intrinsics.checkNotNullExpressionValue(pagerIndex, "pagerIndex");
        pagerIndex.setVisibility(8);
        if (v == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(v.getWidth(), v.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(-1);
        v.draw(canvas);
        GlTextView ivEdit2 = ((FragmentCollectionShareBinding) getBinding()).ivEdit;
        Intrinsics.checkNotNullExpressionValue(ivEdit2, "ivEdit");
        ivEdit2.setVisibility(0);
        TextView pagerIndex2 = ((FragmentCollectionShareBinding) getBinding()).pagerIndex;
        Intrinsics.checkNotNullExpressionValue(pagerIndex2, "pagerIndex");
        pagerIndex2.setVisibility(0);
        return createBitmap;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    protected String getPageName() {
        String lowerCase = "CollectionShareFragment".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return com.glority.android.picturexx.business.R.layout.fragment_collection_share;
    }
}
