package com.glority.android.picturexx.widget;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CountrySearchBar.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR/\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R/\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/glority/android/picturexx/widget/CountrySearchBarState;", "", "selectedCountry", "", "searchText", "isFocused", "", "alwaysShowCancel", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "<set-?>", "getSelectedCountry", "()Ljava/lang/String;", "setSelectedCountry", "(Ljava/lang/String;)V", "selectedCountry$delegate", "Landroidx/compose/runtime/MutableState;", "()Z", "setFocused", "(Z)V", "isFocused$delegate", "getAlwaysShowCancel", "setAlwaysShowCancel", "alwaysShowCancel$delegate", "getSearchText", "setSearchText", "searchText$delegate", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CountrySearchBarState {
    public static final int $stable = 0;

    /* renamed from: alwaysShowCancel$delegate, reason: from kotlin metadata */
    private final MutableState alwaysShowCancel;

    /* renamed from: isFocused$delegate, reason: from kotlin metadata */
    private final MutableState isFocused;

    /* renamed from: searchText$delegate, reason: from kotlin metadata */
    private final MutableState searchText;

    /* renamed from: selectedCountry$delegate, reason: from kotlin metadata */
    private final MutableState selectedCountry;

    public CountrySearchBarState(String str, String str2, boolean z, boolean z2) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
        this.selectedCountry = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        this.isFocused = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z2), null, 2, null);
        this.alwaysShowCancel = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str2, null, 2, null);
        this.searchText = mutableStateOf$default4;
    }

    public /* synthetic */ CountrySearchBarState(String str, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getSelectedCountry() {
        return (String) this.selectedCountry.getValue();
    }

    public final void setSelectedCountry(String str) {
        this.selectedCountry.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isFocused() {
        return ((Boolean) this.isFocused.getValue()).booleanValue();
    }

    public final void setFocused(boolean z) {
        this.isFocused.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getAlwaysShowCancel() {
        return ((Boolean) this.alwaysShowCancel.getValue()).booleanValue();
    }

    public final void setAlwaysShowCancel(boolean z) {
        this.alwaysShowCancel.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getSearchText() {
        return (String) this.searchText.getValue();
    }

    public final void setSearchText(String str) {
        this.searchText.setValue(str);
    }
}
