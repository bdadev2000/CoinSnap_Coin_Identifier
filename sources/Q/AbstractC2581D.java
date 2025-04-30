package q;

import T.C0264d;
import T.InterfaceC0262c;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* renamed from: q.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2581D {
    public static boolean a(@NonNull DragEvent dragEvent, @NonNull TextView textView, @NonNull Activity activity) {
        InterfaceC0262c interfaceC0262c;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC0262c = new E1.c(clipData, 3);
            } else {
                C0264d c0264d = new C0264d();
                c0264d.f2880c = clipData;
                c0264d.f2881d = 3;
                interfaceC0262c = c0264d;
            }
            ViewCompat.performReceiveContent(textView, interfaceC0262c.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(@NonNull DragEvent dragEvent, @NonNull View view, @NonNull Activity activity) {
        InterfaceC0262c interfaceC0262c;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0262c = new E1.c(clipData, 3);
        } else {
            C0264d c0264d = new C0264d();
            c0264d.f2880c = clipData;
            c0264d.f2881d = 3;
            interfaceC0262c = c0264d;
        }
        ViewCompat.performReceiveContent(view, interfaceC0262c.build());
        return true;
    }
}
