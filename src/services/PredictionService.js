const tfjs = require('@tensorflow/tfjs');

const PredictionService = {
  async loadModel() {
    const model = await tfjs.loadLayersModel('../../tfjsmodel/model.json');
    return model;
  },
  async convertToImages(image) {
    const test = await tfjs.browser.fromPixels(image);
    console.log(test);
  },
};

module.exports = PredictionService;
