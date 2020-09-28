package drawOAndr;

public class AxisCalculator {
	//please sure: minCount <= maxCount, min <= max
	public static float[] cal(int minCount, int maxCount, float min, float max) {
		float[] res = new float[3];
		float diff = max - min;
		float maxInterval = diff/minCount;
		float minInterval = diff/maxCount;
		res[2] = pickInterval(minInterval, maxInterval);
		res[0] = fixMinWith(res[2], min);
		res[1] = fixMaxWith(res[2], max);
		return res;
	}

	public static float fixMaxWith(float interval, float max) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static float fixMinWith(float interval, float min) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static float pickInterval(float minInterval, float maxInterval) {
		int powForMin = calPow(minInterval);
		float minPick = pickMinIntervalFrom(minInterval*(float)Math.pow(10, powForMin));
		int powForMax = calPow(maxInterval);
		float maxPick = pickMaxIntervalFrom(maxInterval*(float)Math.pow(10, powForMax));
		return pickIntervalBase(minPick, powForMin, maxPick, powForMax);
	}

	private static float pickMaxIntervalFrom(float maxInterval, int powForMax) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static float pickMinIntervalFrom(float minInterval) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int calPow(float minInterval) {
		// TODO Auto-generated method stub
		return 0;
	}

}
