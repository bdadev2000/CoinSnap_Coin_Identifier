package com.glority.android.picturexx.view.me;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.picturexx.business.databinding.FragmentCustomDetailBinding;
import com.glority.android.picturexx.view.BaseCmsDetailFragment;
import com.glority.android.picturexx.vm.MeViewModel;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.component.generatedAPI.kotlinAPI.cms.GetCmsNameMessage;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: WishInfoFragment.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0014J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u0013R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/glority/android/picturexx/view/me/WishInfoFragment;", "Lcom/glority/android/picturexx/view/BaseCmsDetailFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentCustomDetailBinding;", "<init>", "()V", Args.uid, "", "vm", "Lcom/glority/android/picturexx/vm/MeViewModel;", "getVm", "()Lcom/glority/android/picturexx/vm/MeViewModel;", "vm$delegate", "Lkotlin/Lazy;", "initData", "", "initView", "getLogPageName", "getItemId", "", "()Ljava/lang/Long;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class WishInfoFragment extends BaseCmsDetailFragment<FragmentCustomDetailBinding> {
    public static final int $stable = 8;
    private String uid;

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm = LazyKt.lazy(new Function0<MeViewModel>() { // from class: com.glority.android.picturexx.view.me.WishInfoFragment$vm$2
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final MeViewModel invoke() {
            ViewModel sharedViewModel;
            sharedViewModel = WishInfoFragment.this.getSharedViewModel(MeViewModel.class);
            return (MeViewModel) sharedViewModel;
        }
    });

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public Long getItemId() {
        return null;
    }

    public final MeViewModel getVm() {
        return (MeViewModel) this.vm.getValue();
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public void initData() {
        String str = this.uid;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
                return;
            }
            return;
        }
        getVm().getCmsName(str).observe(this, new WishInfoFragment$sam$androidx_lifecycle_Observer$0(new Function1<Resource<? extends GetCmsNameMessage>, Unit>() { // from class: com.glority.android.picturexx.view.me.WishInfoFragment$initData$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends GetCmsNameMessage> resource) {
                invoke2((Resource<GetCmsNameMessage>) resource);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Resource<GetCmsNameMessage> resource) {
                FragmentActivity activity2;
                if (resource.getStatus() == Status.SUCCESS) {
                    WishInfoFragment wishInfoFragment = WishInfoFragment.this;
                    GetCmsNameMessage data = resource.getData();
                    BaseCmsDetailFragment.updateCmsUi$default(wishInfoFragment, data != null ? data.getCmsName() : null, null, null, null, null, null, 62, null);
                } else {
                    if (resource.getStatus() != Status.ERROR || (activity2 = WishInfoFragment.this.getActivity()) == null) {
                        return;
                    }
                    activity2.onBackPressed();
                }
            }
        }));
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public void initView() {
        super.initView();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("from") : null;
        Bundle arguments2 = getArguments();
        this.uid = arguments2 != null ? arguments2.getString(Args.uid) : null;
        Bundle arguments3 = getArguments();
        updateCommonEventArgs(new Pair("from", string), new Pair(LogEventArguments.ARG_STRING_1, Integer.valueOf(arguments3 != null ? arguments3.getInt(Args.wishId) : 0)), new Pair(LogEventArguments.ARG_STRING_2, this.uid));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment, com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    public String getPageName() {
        return LogEvents.wishdetail;
    }
}
