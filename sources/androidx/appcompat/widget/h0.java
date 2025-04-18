package androidx.appcompat.widget;

import android.app.Activity;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public abstract class h0 {
    public static boolean a(@NonNull DragEvent dragEvent, @NonNull TextView textView, @NonNull Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ViewCompat.performReceiveContent(textView, ((n0.d) new f.a(dragEvent.getClipData(), 3).f17509c).build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th2) {
            textView.endBatchEdit();
            throw th2;
        }
    }

    public static boolean b(@NonNull DragEvent dragEvent, @NonNull View view, @NonNull Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        ViewCompat.performReceiveContent(view, ((n0.d) new f.a(dragEvent.getClipData(), 3).f17509c).build());
        return true;
    }
}
