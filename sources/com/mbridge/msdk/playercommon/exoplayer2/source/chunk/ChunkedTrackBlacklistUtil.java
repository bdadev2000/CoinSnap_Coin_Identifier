package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

import Q7.n0;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource;

/* loaded from: classes3.dex */
public final class ChunkedTrackBlacklistUtil {
    public static final long DEFAULT_TRACK_BLACKLIST_MS = 60000;
    private static final String TAG = "ChunkedTrackBlacklist";

    private ChunkedTrackBlacklistUtil() {
    }

    public static boolean maybeBlacklistTrack(TrackSelection trackSelection, int i9, Exception exc) {
        return maybeBlacklistTrack(trackSelection, i9, exc, DEFAULT_TRACK_BLACKLIST_MS);
    }

    public static boolean shouldBlacklist(Exception exc) {
        if (!(exc instanceof HttpDataSource.InvalidResponseCodeException)) {
            return false;
        }
        int i9 = ((HttpDataSource.InvalidResponseCodeException) exc).responseCode;
        if (i9 != 404 && i9 != 410) {
            return false;
        }
        return true;
    }

    public static boolean maybeBlacklistTrack(TrackSelection trackSelection, int i9, Exception exc, long j7) {
        if (!shouldBlacklist(exc)) {
            return false;
        }
        boolean blacklist = trackSelection.blacklist(i9, j7);
        int i10 = ((HttpDataSource.InvalidResponseCodeException) exc).responseCode;
        if (blacklist) {
            Log.w(TAG, "Blacklisted: duration=" + j7 + ", responseCode=" + i10 + ", format=" + trackSelection.getFormat(i9));
        } else {
            StringBuilder p2 = n0.p(i10, "Blacklisting failed (cannot blacklist last enabled track): responseCode=", ", format=");
            p2.append(trackSelection.getFormat(i9));
            Log.w(TAG, p2.toString());
        }
        return blacklist;
    }
}
