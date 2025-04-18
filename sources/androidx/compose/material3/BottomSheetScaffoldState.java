package androidx.compose.material3;

import androidx.compose.runtime.Stable;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes3.dex */
public final class BottomSheetScaffoldState {

    /* renamed from: a, reason: collision with root package name */
    public final SheetState f8032a;

    /* renamed from: b, reason: collision with root package name */
    public final SnackbarHostState f8033b;

    public BottomSheetScaffoldState(SheetState sheetState, SnackbarHostState snackbarHostState) {
        this.f8032a = sheetState;
        this.f8033b = snackbarHostState;
    }
}
