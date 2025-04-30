package F3;

import U.i;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import c0.AbstractC0583b;
import com.google.android.material.chip.Chip;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class c extends AbstractC0583b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f1148q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Chip chip, Chip chip2) {
        super(chip2);
        this.f1148q = chip;
    }

    @Override // c0.AbstractC0583b
    public final void l(ArrayList arrayList) {
        boolean z8 = false;
        arrayList.add(0);
        Rect rect = Chip.f13991y;
        Chip chip = this.f1148q;
        if (chip.c()) {
            e eVar = chip.f13993g;
            if (eVar != null && eVar.f1171M) {
                z8 = true;
            }
            if (z8 && chip.f13996j != null) {
                arrayList.add(1);
            }
        }
    }

    @Override // c0.AbstractC0583b
    public final void o(int i9, i iVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f3098a;
        CharSequence charSequence = "";
        if (i9 == 1) {
            Chip chip = this.f1148q;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                accessibilityNodeInfo.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, charSequence).trim());
            }
            closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
            accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
            iVar.b(U.d.f3086e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            return;
        }
        accessibilityNodeInfo.setContentDescription("");
        accessibilityNodeInfo.setBoundsInParent(Chip.f13991y);
    }
}
