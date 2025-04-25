package com.glority.android.picturexx.vm;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.picturexx.constants.BusinessConstants;
import com.glority.android.picturexx.repository.NoteSnapRepository;
import com.glority.android.picturexx.view.notesnap.NoteSnap30FreeDialog;
import com.glority.base.abtest.CoinAbTestUtils;
import com.glority.base.routers.OpenBillingActivityRequest;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.base.viewmodel.BaseViewModel;
import com.glority.network.model.Resource;
import com.glority.utils.stability.LogUtils;
import com.picturecoin.generatedAPI.kotlinAPI.application.GetAndUseGooglePromoCodeMessage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NoteSnapViewModel.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00050\u000bJ\u0016\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\u0012\u001a\u00020\u0005J\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014¨\u0006\u0019"}, d2 = {"Lcom/glority/android/picturexx/vm/NoteSnapViewModel;", "Lcom/glority/base/viewmodel/BaseViewModel;", "<init>", "()V", "openConvertPage", "", "context", "Landroid/content/Context;", "from", "", "onDismiss", "Lkotlin/Function1;", "Lcom/glority/android/picturexx/vm/NoteSnapViewModel$DismissType;", "Lkotlin/ParameterName;", "name", "type", "toVerify", "promoCode", "notInterested", "requestPromoCode", "Landroidx/lifecycle/LiveData;", "Lcom/glority/network/model/Resource;", "Lcom/picturecoin/generatedAPI/kotlinAPI/application/GetAndUseGooglePromoCodeMessage;", "Companion", "DismissType", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class NoteSnapViewModel extends BaseViewModel {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final MutableLiveData<Boolean> homeNoteSnapBannerVisibleLiveData;
    private static final MutableLiveData<Boolean> noteSnapRedDotVisibleLiveData;

    /* compiled from: NoteSnapViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0006J\b\u0010\r\u001a\u00020\u0006H\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0002J\u0006\u0010\u000f\u001a\u00020\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/glority/android/picturexx/vm/NoteSnapViewModel$Companion;", "", "<init>", "()V", "noteSnapRedDotVisibleLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getNoteSnapRedDotVisibleLiveData", "()Landroidx/lifecycle/MutableLiveData;", "homeNoteSnapBannerVisibleLiveData", "getHomeNoteSnapBannerVisibleLiveData", "enableNoteSnapOffer", "visibleNoteSnapOffer", "visibleNoteSnapOfferBanner", "visibleSettingRedDot", "hasClickByUser", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MutableLiveData<Boolean> getNoteSnapRedDotVisibleLiveData() {
            return NoteSnapViewModel.noteSnapRedDotVisibleLiveData;
        }

        public final MutableLiveData<Boolean> getHomeNoteSnapBannerVisibleLiveData() {
            return NoteSnapViewModel.homeNoteSnapBannerVisibleLiveData;
        }

        public final boolean enableNoteSnapOffer() {
            return CoinAbTestUtils.INSTANCE.enableBankNoteOffer();
        }

        public final boolean visibleNoteSnapOffer() {
            return !((Boolean) PersistData.INSTANCE.get(BusinessConstants.INSTANCE.getNOTE_SNAP_CLAIM(), false)).booleanValue() && enableNoteSnapOffer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean visibleNoteSnapOfferBanner() {
            return (((Boolean) PersistData.INSTANCE.get(BusinessConstants.INSTANCE.getNOTE_SNAP_NOT_INTERESTED(), false)).booleanValue() || ((Boolean) PersistData.INSTANCE.get(BusinessConstants.INSTANCE.getNOTE_SNAP_BANNER_CLICKED(), false)).booleanValue() || !visibleNoteSnapOffer()) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean visibleSettingRedDot() {
            return !((Boolean) PersistData.INSTANCE.get(BusinessConstants.KEY_NOTESNAP_SETTINGS_CLICK, false)).booleanValue() && visibleNoteSnapOffer();
        }

        public final boolean hasClickByUser() {
            return ((Boolean) PersistData.INSTANCE.get(BusinessConstants.INSTANCE.getNOTE_SNAP_BANNER_CLICKED(), false)).booleanValue() || ((Boolean) PersistData.INSTANCE.get(BusinessConstants.KEY_NOTESNAP_SETTINGS_CLICK, false)).booleanValue();
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(Boolean.valueOf(companion.visibleSettingRedDot()));
        noteSnapRedDotVisibleLiveData = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(Boolean.valueOf(companion.visibleNoteSnapOfferBanner()));
        homeNoteSnapBannerVisibleLiveData = mutableLiveData2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NoteSnapViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/android/picturexx/vm/NoteSnapViewModel$DismissType;", "", "<init>", "(Ljava/lang/String;I)V", "CLAIM", "NOT_INTERESTED", "ONLY_DISMISS", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class DismissType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DismissType[] $VALUES;
        public static final DismissType CLAIM = new DismissType("CLAIM", 0);
        public static final DismissType NOT_INTERESTED = new DismissType("NOT_INTERESTED", 1);
        public static final DismissType ONLY_DISMISS = new DismissType("ONLY_DISMISS", 2);

        private static final /* synthetic */ DismissType[] $values() {
            return new DismissType[]{CLAIM, NOT_INTERESTED, ONLY_DISMISS};
        }

        public static EnumEntries<DismissType> getEntries() {
            return $ENTRIES;
        }

        private DismissType(String str, int i) {
        }

        static {
            DismissType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static DismissType valueOf(String str) {
            return (DismissType) Enum.valueOf(DismissType.class, str);
        }

        public static DismissType[] values() {
            return (DismissType[]) $VALUES.clone();
        }
    }

    public final void openConvertPage(Context context, String from, Function1<? super DismissType, Unit> onDismiss) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        if (AppViewModel.INSTANCE.isVip()) {
            NoteSnap30FreeDialog.INSTANCE.show(context, from, onDismiss);
            return;
        }
        if (AppViewModel.INSTANCE.getInstance().isVipInHistory()) {
            new OpenBillingActivityRequest(from, "100042", 20).post();
        } else {
            new OpenBillingActivityRequest(from, "100041", 20).post();
        }
        onDismiss.invoke(DismissType.ONLY_DISMISS);
    }

    public final void toVerify(String promoCode, Context context) {
        Intrinsics.checkNotNullParameter(promoCode, "promoCode");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            PersistData.INSTANCE.set(BusinessConstants.INSTANCE.getNOTE_SNAP_CLAIM(), true);
            homeNoteSnapBannerVisibleLiveData.postValue(false);
            noteSnapRedDotVisibleLiveData.postValue(false);
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/redeem?code=" + promoCode)));
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    public final void notInterested() {
        PersistData.INSTANCE.set(BusinessConstants.INSTANCE.getNOTE_SNAP_NOT_INTERESTED(), true);
        homeNoteSnapBannerVisibleLiveData.postValue(false);
        noteSnapRedDotVisibleLiveData.postValue(false);
    }

    public final LiveData<Resource<GetAndUseGooglePromoCodeMessage>> requestPromoCode() {
        return NoteSnapRepository.INSTANCE.getPromoCodeMessage();
    }
}
