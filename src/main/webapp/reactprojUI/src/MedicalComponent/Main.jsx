import React, {Component} from 'react';
import { Link } from 'react-router';

class Main extends Component {
    render(){
        return(
            <div>
                <div className="header">
                </div>
                <div>
                    <div className="container">
                        {this.props.children}
                    </div>
                </div>
            </div>
        );
    }
}

export default Main