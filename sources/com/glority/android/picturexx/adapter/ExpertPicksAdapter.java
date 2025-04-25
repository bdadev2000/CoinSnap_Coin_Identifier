package com.glority.android.picturexx.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.ItemExpertTagBinding;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.fragment.WebViewFragment;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.widget.imagepager.GlNormalImagePagerActivity;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.picturecoin.generatedAPI.kotlinAPI.article.ErrorCoinType;
import com.picturecoin.generatedAPI.kotlinAPI.article.ExpertPick;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExpertPicksAdapter.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0014J&\u0010\u0010\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J \u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0003J(\u0010\u001d\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u00022\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0012H\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/glority/android/picturexx/adapter/ExpertPicksAdapter;", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "Lcom/glority/android/picturexx/adapter/ExpertPickItemWrapper;", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "unlockClick", "Lkotlin/Function0;", "", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lkotlin/jvm/functions/Function0;)V", "getRv", "()Landroidx/recyclerview/widget/RecyclerView;", "convert", "helper", "wrapper", "addTags", "errorCoinTypes", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/article/ErrorCoinType;", "itemView", "Landroid/view/View;", "position", "", "addImages", "item", "Lcom/picturecoin/generatedAPI/kotlinAPI/article/ExpertPick;", "rootView", "Landroid/view/ViewGroup;", "convertPayloads", "payloads", "", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class ExpertPicksAdapter extends BaseQuickAdapter<ExpertPickItemWrapper, BaseViewHolder> {
    public static final int PAY_LOAD_EXPAND = 1;
    private final RecyclerView rv;
    private final Function0<Unit> unlockClick;
    public static final int $stable = 8;

    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public /* bridge */ /* synthetic */ void convertPayloads(BaseViewHolder baseViewHolder, ExpertPickItemWrapper expertPickItemWrapper, List list) {
        convertPayloads2(baseViewHolder, expertPickItemWrapper, (List<Object>) list);
    }

    public final RecyclerView getRv() {
        return this.rv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpertPicksAdapter(RecyclerView rv, Function0<Unit> unlockClick) {
        super(R.layout.item_expert_picks, null, 2, null);
        Intrinsics.checkNotNullParameter(rv, "rv");
        Intrinsics.checkNotNullParameter(unlockClick, "unlockClick");
        this.rv = rv;
        this.unlockClick = unlockClick;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public void convert(BaseViewHolder helper, ExpertPickItemWrapper wrapper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        ExpertPick expertPick = wrapper.getExpertPick();
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        addImages(expertPick, itemView, this.rv);
        List<ErrorCoinType> errorCoinTypes = expertPick.getErrorCoinTypes();
        View itemView2 = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        addTags(errorCoinTypes, itemView2, helper.getLayoutPosition());
        TextView textView = (TextView) helper.getView(R.id.content_tv);
        textView.setText(expertPick.getContent());
        if (!wrapper.getExpand()) {
            helper.getView(R.id.lock_mask_fl).setVisibility(0);
            textView.setMaxLines(5);
        } else {
            helper.getView(R.id.lock_mask_fl).setVisibility(8);
            textView.setMaxLines(Integer.MAX_VALUE);
        }
        View itemView3 = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
        ViewExtensionsKt.setSingleClickListener$default(itemView3, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.adapter.ExpertPicksAdapter$convert$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                new LogEventRequest(LogEvents.experkpicks_article_click, null, 2, null).post();
            }
        }, 1, (Object) null);
        ViewExtensionsKt.setSingleClickListener$default(helper.getView(R.id.lock_btn), 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.adapter.ExpertPicksAdapter$convert$2
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
                Function0 function0;
                Intrinsics.checkNotNullParameter(it, "it");
                function0 = ExpertPicksAdapter.this.unlockClick;
                function0.invoke();
            }
        }, 1, (Object) null);
    }

    private final void addTags(List<ErrorCoinType> errorCoinTypes, View itemView, final int position) {
        final Context context = itemView.getContext();
        ViewGroup viewGroup = (ViewGroup) itemView.findViewById(R.id.tag_ll);
        viewGroup.removeAllViews();
        for (final ErrorCoinType errorCoinType : errorCoinTypes) {
            ItemExpertTagBinding inflate = ItemExpertTagBinding.inflate(LayoutInflater.from(context));
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            viewGroup.addView(inflate.getRoot());
            inflate.titleTv.setText(errorCoinType.getName());
            View root = inflate.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ViewExtensionsKt.setSingleClickListener$default(root, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.adapter.ExpertPicksAdapter$addTags$1$1
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
                public final void invoke2(View v) {
                    Function0 function0;
                    Intrinsics.checkNotNullParameter(v, "v");
                    if (context instanceof Activity) {
                        new LogEventRequest(LogEvents.experkpicks_tag_click, BundleKt.bundleOf(TuplesKt.to(LogEventArguments.ARG_STRING_1, errorCoinType.getName()))).post();
                        if (position > 3 && !AppViewModel.INSTANCE.isVip()) {
                            function0 = this.unlockClick;
                            function0.invoke();
                            return;
                        }
                        String descriptionUrl = errorCoinType.getDescriptionUrl();
                        if (descriptionUrl == null || descriptionUrl.length() == 0) {
                            return;
                        }
                        WebViewFragment.Companion companion = WebViewFragment.INSTANCE;
                        Activity activity = (Activity) context;
                        String descriptionUrl2 = errorCoinType.getDescriptionUrl();
                        if (descriptionUrl2 == null) {
                            descriptionUrl2 = "";
                        }
                        WebViewFragment.Companion.open$default(companion, activity, descriptionUrl2, errorCoinType.getName(), null, null, true, 24, null);
                    }
                }
            }, 1, (Object) null);
        }
    }

    private final void addImages(final ExpertPick item, View itemView, final ViewGroup rootView) {
        ViewGroup viewGroup = (ViewGroup) itemView.findViewById(R.id.image_ll);
        viewGroup.removeAllViews();
        final HorizontalScrollView horizontalScrollView = (HorizontalScrollView) itemView.findViewById(R.id.image_hsv);
        horizontalScrollView.setOnTouchListener(new View.OnTouchListener() { // from class: com.glority.android.picturexx.adapter.ExpertPicksAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean addImages$lambda$1;
                addImages$lambda$1 = ExpertPicksAdapter.addImages$lambda$1(horizontalScrollView, rootView, view, motionEvent);
                return addImages$lambda$1;
            }
        });
        final int i = 0;
        for (Object obj : item.getImageUrls()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final String str = (String) obj;
            ShapeableImageView shapeableImageView = new ShapeableImageView(horizontalScrollView.getContext());
            ShapeAppearanceModel build = ShapeAppearanceModel.builder().setAllCorners(0, 12.0f).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            shapeableImageView.setShapeAppearanceModel(build);
            shapeableImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            shapeableImageView.setAdjustViewBounds(true);
            ShapeableImageView shapeableImageView2 = shapeableImageView;
            Glide.with(shapeableImageView2).load(str).into(shapeableImageView);
            ViewExtensionsKt.setSingleClickListener$default(shapeableImageView2, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.adapter.ExpertPicksAdapter$addImages$2$1
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
                    new LogEventRequest(LogEvents.experkpicks_image_click, BundleKt.bundleOf(TuplesKt.to(LogEventArguments.ARG_STRING_1, str))).post();
                    GlNormalImagePagerActivity.Companion companion = GlNormalImagePagerActivity.INSTANCE;
                    Context context = it.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    companion.open(context, (String[]) item.getImageUrls().toArray(new String[0]), i);
                }
            }, 1, (Object) null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (i == 0) {
                layoutParams.setMarginStart(viewGroup.getResources().getDimensionPixelOffset(R.dimen.x24));
            } else {
                layoutParams.setMarginStart(viewGroup.getResources().getDimensionPixelOffset(R.dimen.x12));
                layoutParams.setMarginEnd(viewGroup.getResources().getDimensionPixelOffset(R.dimen.x12));
            }
            Unit unit = Unit.INSTANCE;
            viewGroup.addView(shapeableImageView2, layoutParams);
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r4 != 3) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean addImages$lambda$1(android.widget.HorizontalScrollView r2, android.view.ViewGroup r3, android.view.View r4, android.view.MotionEvent r5) {
        /*
            java.lang.String r4 = "$rootView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            int r4 = r5.getAction()
            r5 = 0
            r0 = 1
            if (r4 == r0) goto L2a
            r1 = 2
            if (r4 == r1) goto L14
            r2 = 3
            if (r4 == r2) goto L2a
            goto L2d
        L14:
            boolean r4 = r2.canScrollHorizontally(r0)
            if (r4 != 0) goto L26
            r4 = -1
            boolean r2 = r2.canScrollHorizontally(r4)
            if (r2 == 0) goto L22
            goto L26
        L22:
            r3.requestDisallowInterceptTouchEvent(r5)
            goto L2d
        L26:
            r3.requestDisallowInterceptTouchEvent(r0)
            goto L2d
        L2a:
            r3.requestDisallowInterceptTouchEvent(r5)
        L2d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.adapter.ExpertPicksAdapter.addImages$lambda$1(android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: convertPayloads, reason: avoid collision after fix types in other method */
    protected void convertPayloads2(BaseViewHolder helper, ExpertPickItemWrapper item, List<Object> payloads) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.contains(1)) {
            TextView textView = (TextView) helper.getView(R.id.content_tv);
            if (item != null && item.getExpand()) {
                helper.getView(R.id.lock_mask_fl).setVisibility(8);
                textView.setMaxLines(Integer.MAX_VALUE);
            } else {
                helper.getView(R.id.lock_mask_fl).setVisibility(0);
                textView.setMaxLines(5);
            }
        }
    }
}
