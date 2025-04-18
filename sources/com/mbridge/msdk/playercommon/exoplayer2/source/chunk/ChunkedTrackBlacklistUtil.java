package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

import a4.j;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource;

/* loaded from: classes4.dex */
public final class ChunkedTrackBlacklistUtil {
    public static final long DEFAULT_TRACK_BLACKLIST_MS = 60000;
    private static final String TAG = "ChunkedTrackBlacklist";

    private ChunkedTrackBlacklistUtil() {
    }

    public static boolean maybeBlacklistTrack(TrackSelection trackSelection, int i10, Exception exc) {
        return maybeBlacklistTrack(trackSelection, i10, exc, DEFAULT_TRACK_BLACKLIST_MS);
    }

    public static boolean shouldBlacklist(Exception exc) {
        if (!(exc instanceof HttpDataSource.InvalidResponseCodeException)) {
            return false;
        }
        int i10 = ((HttpDataSource.InvalidResponseCodeException) exc).responseCode;
        if (i10 != 404 && i10 != 410) {
            return false;
        }
        return true;
    }

    public static boolean maybeBlacklistTrack(TrackSelection trackSelection, int i10, Exception exc, long j3) {
        if (!shouldBlacklist(exc)) {
            return false;
        }
        boolean blacklist = trackSelection.blacklist(i10, j3);
        int i11 = ((HttpDataSource.InvalidResponseCodeException) exc).responseCode;
        if (blacklist) {
            Log.w(TAG, "Blacklisted: duration=" + j3 + ", responseCode=" + i11 + ", format=" + trackSelection.getFormat(i10));
        } else {
            StringBuilder m10 = j.m("Blacklisting failed (cannot blacklist last enabled track): responseCode=", i11, ", format=");
            m10.append(trackSelection.getFormat(i10));
            Log.w(TAG, m10.toString());
        }
        return blacklist;
    }
}
