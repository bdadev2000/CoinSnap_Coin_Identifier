package com.glority.android.picturexx.settings.fragment.setting;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.glority.android.picturexx.settings.databinding.ItemPremiumServerBinding;
import com.glority.base.routers.GetPremiumContentRequest;
import com.glority.base.routers.OpenBillingActivityRequest;
import com.glority.base.utils.AbTestUtil;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.vip.VipInfo;
import com.glority.widget.GlTextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: PremiumServiceFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/glority/component/generatedAPI/kotlinAPI/vip/VipInfo;", "kotlin.jvm.PlatformType", "invoke", "(Lcom/glority/component/generatedAPI/kotlinAPI/vip/VipInfo;)V"}, k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
final class PremiumServiceFragment$doCreateView$1 extends Lambda implements Function1<VipInfo, Unit> {
    final /* synthetic */ PremiumServiceFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumServiceFragment$doCreateView$1(PremiumServiceFragment premiumServiceFragment) {
        super(1);
        this.this$0 = premiumServiceFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(VipInfo vipInfo) {
        invoke2(vipInfo);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(VipInfo vipInfo) {
        if (AppViewModel.INSTANCE.isVip()) {
            View root = PremiumServiceFragment.access$getBinding(this.this$0).unvipCard.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            root.setVisibility(8);
            View root2 = PremiumServiceFragment.access$getBinding(this.this$0).vipCard.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
            root2.setVisibility(0);
            PremiumServiceFragment.access$getBinding(this.this$0).vipCard.numberTv.setText("NO." + AppViewModel.INSTANCE.getUserId());
        } else {
            View root3 = PremiumServiceFragment.access$getBinding(this.this$0).unvipCard.getRoot();
            Intrinsics.checkNotNullExpressionValue(root3, "getRoot(...)");
            root3.setVisibility(0);
            View root4 = PremiumServiceFragment.access$getBinding(this.this$0).vipCard.getRoot();
            Intrinsics.checkNotNullExpressionValue(root4, "getRoot(...)");
            root4.setVisibility(8);
            TextView textView = PremiumServiceFragment.access$getBinding(this.this$0).unvipCard.beMemberTv;
            final PremiumServiceFragment premiumServiceFragment = this.this$0;
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.settings.fragment.setting.PremiumServiceFragment$doCreateView$1$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PremiumServiceFragment$doCreateView$1.invoke$lambda$0(PremiumServiceFragment.this, view);
                }
            });
        }
        GetPremiumContentRequest.PremiumContent result = new GetPremiumContentRequest().toResult();
        if (result != null) {
            PremiumServiceFragment premiumServiceFragment2 = this.this$0;
            PremiumServiceFragment.access$getBinding(premiumServiceFragment2).containerV.removeAllViews();
            LinearLayout premiumTitle = PremiumServiceFragment.access$getBinding(premiumServiceFragment2).premiumTitle;
            Intrinsics.checkNotNullExpressionValue(premiumTitle, "premiumTitle");
            premiumTitle.setVisibility(result.getTitle().isEmpty() ^ true ? 0 : 8);
            int i = 0;
            for (Object obj : result.getTitle()) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str = (String) obj;
                ItemPremiumServerBinding inflate = ItemPremiumServerBinding.inflate(premiumServiceFragment2.getLayoutInflater(), PremiumServiceFragment.access$getBinding(premiumServiceFragment2).containerV, true);
                Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
                if (AppViewModel.INSTANCE.isVip()) {
                    inflate.iv.setImageResource(result.getVipIcon().get(i).intValue());
                } else {
                    inflate.iv.setImageResource(result.getUnVipIcon().get(i).intValue());
                }
                inflate.title.setText(str);
                if (result.getDesc() != null) {
                    GlTextView desc = inflate.desc;
                    Intrinsics.checkNotNullExpressionValue(desc, "desc");
                    desc.setVisibility(0);
                    GlTextView glTextView = inflate.desc;
                    List<String> desc2 = result.getDesc();
                    Intrinsics.checkNotNull(desc2);
                    glTextView.setText(desc2.get(i));
                } else {
                    GlTextView desc3 = inflate.desc;
                    Intrinsics.checkNotNullExpressionValue(desc3, "desc");
                    desc3.setVisibility(8);
                }
                i = i2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(PremiumServiceFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new OpenBillingActivityRequest(this$0.getPageName(), String.valueOf(AbTestUtil.INSTANCE.getConversionPageId()), 20).toResult();
    }
}
